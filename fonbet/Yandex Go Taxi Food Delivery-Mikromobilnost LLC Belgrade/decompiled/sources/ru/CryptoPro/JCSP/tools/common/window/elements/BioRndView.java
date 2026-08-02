package ru.CryptoPro.JCSP.tools.common.window.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import defpackage.fqg0;
import defpackage.nwg0;
import defpackage.oyr;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.CSPInternalConfig;
import ru.CryptoPro.JCSP.tools.common.window.DialogConstants;
import ru.CryptoPro.JCSP.tools.common.window.ICSPBioController;

/* loaded from: classes4.dex */
public final class BioRndView extends View implements IBioNetObject, IBioRndStatistics, IBioAnalysable, DialogConstants {
    private static final String BIO_ANALYSIS_COUNTER = "bioAnalysisCounter";
    private static final String DYNAMIC_PADDING_X = "dynamicPaddingX";
    private static final String DYNAMIC_PADDING_Y = "dynamicPaddingY";
    private static final String INSTANCE_STATE = "instanceState";
    private static final String IS_FINISHED = "isFinished";
    private static final String SECURE_POINTS = "securePoints";
    private static final boolean bioAnalysisEnabled = false;
    private final Object LOCK;
    private int bioAnalysisCounter;
    private ICSPBioController bioController;
    private BioNet bioNet;
    private final int cellColor;
    private final int cornerRadiusForCell;
    private boolean isFinished;
    private String logDirectory;
    private CspBioProgressController progressController;
    private final int sideOfCell;
    private Bundle state;

    public BioRndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.state = null;
        this.bioNet = null;
        this.logDirectory = null;
        this.progressController = null;
        this.bioController = null;
        this.bioAnalysisCounter = 0;
        this.isFinished = false;
        this.LOCK = new Object();
        this.sideOfCell = getResources().getDimensionPixelSize(nwg0.dialog_bio_cell_side_length);
        this.cornerRadiusForCell = getResources().getDimensionPixelSize(nwg0.dialog_bio_cell_corner_radius);
        this.cellColor = context.getColor(fqg0.bio_cell_color);
        if (CSPInternalConfig.needLogBioStatistics()) {
            this.logDirectory = CSPInternalConfig.getBioStatisticsDirectory();
        }
    }

    private void initNet() {
        if (this.bioNet == null) {
            Rect rect = new Rect();
            getLocalVisibleRect(rect);
            BioNet bioNet = new BioNet(this, rect, this.cellColor, this.sideOfCell, this.cornerRadiusForCell);
            this.bioNet = bioNet;
            Bundle bundle = this.state;
            if (bundle != null) {
                bioNet.restoreDynamicPaddingAndSelectedBlocks(bundle.getInt(DYNAMIC_PADDING_X, 0), this.state.getInt(DYNAMIC_PADDING_Y, 0), this.state.getParcelableArrayList(SECURE_POINTS));
                this.state = null;
            }
            if (isBioAnalysisEnabled()) {
                logBioData(IBioRndStatistics.BIO_STAT_STAT_INDENT_X_FILENAME, this.bioNet.getNullZoneX());
                logBioData(IBioRndStatistics.BIO_STAT_STAT_INDENT_Y_FILENAME, this.bioNet.getNullZoneY());
            }
        }
    }

    private void logBioData(String str, long j) {
        if (this.logDirectory == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.logDirectory);
        logBioData2File(oyr.t(sb, File.separator, str), IBioRndStatistics.BIO_DEFAULT_FORMAT, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r1 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void logBioData2File(String str, String str2, long j) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, true)));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
            try {
                bufferedWriter.write(String.format(str2, Long.valueOf(j)));
                bufferedWriter.write("\n");
                bufferedWriter.close();
            } catch (FileNotFoundException e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                Log.e(DialogConstants.APP_LOGGER_TAG, "File not found.", e);
            } catch (IOException e4) {
                e = e4;
                bufferedWriter2 = bufferedWriter;
                Log.e(DialogConstants.APP_LOGGER_TAG, "I/O error.", e);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioNetObject
    public boolean hit(Point point) {
        BioNet bioNet = this.bioNet;
        if (bioNet == null) {
            return false;
        }
        if (bioNet.hit(point)) {
            return true;
        }
        if (isBioAnalysisEnabled()) {
            logBioData(IBioRndStatistics.BIO_STAT_DYN_INDENT_X_FILENAME, this.bioNet.getDynamicPaddingX());
            logBioData(IBioRndStatistics.BIO_STAT_DYN_INDENT_Y_FILENAME, this.bioNet.getDynamicPaddingY());
        }
        invalidate();
        return false;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioAnalysable
    public boolean isBioAnalysisEnabled() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        initNet();
        this.bioNet.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        this.bioAnalysisCounter = bundle.getInt(BIO_ANALYSIS_COUNTER, 0);
        this.isFinished = bundle.getBoolean(IS_FINISHED, false);
        this.state = bundle;
        super.onRestoreInstanceState(bundle.getParcelable(INSTANCE_STATE));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt(BIO_ANALYSIS_COUNTER, this.bioAnalysisCounter);
        bundle.putBoolean(IS_FINISHED, this.isFinished);
        bundle.putParcelableArrayList(SECURE_POINTS, this.bioNet.getSecurePoints());
        bundle.putInt(DYNAMIC_PADDING_X, this.bioNet.getDynamicPaddingX());
        bundle.putInt(DYNAMIC_PADDING_Y, this.bioNet.getDynamicPaddingY());
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int onTouch;
        int i;
        synchronized (this.LOCK) {
            try {
                if (this.isFinished) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (this.progressController == null) {
                    throw new RuntimeException("Bio rnd indicator is invalid (null).");
                }
                long eventTime = motionEvent.getEventTime() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (isBioAnalysisEnabled()) {
                    logBioData(IBioRndStatistics.BIO_STAT_ABS_TIME_FILENAME, eventTime);
                    logBioData(IBioRndStatistics.BIO_STAT_ABS_X_FILENAME, x);
                    logBioData(IBioRndStatistics.BIO_STAT_ABS_Y_FILENAME, y);
                }
                if (hit(new Point(x, y))) {
                    return false;
                }
                if (this.logDirectory != null) {
                    logBioData(IBioRndStatistics.BIO_STAT_TIME_FILENAME, eventTime);
                    logBioData(IBioRndStatistics.BIO_STAT_X_FILENAME, x);
                    logBioData(IBioRndStatistics.BIO_STAT_Y_FILENAME, y);
                }
                if (isBioAnalysisEnabled()) {
                    i = this.bioAnalysisCounter;
                    this.bioAnalysisCounter = i + 1;
                    onTouch = i < this.progressController.getMax() ? 0 : 1;
                } else {
                    performHapticFeedback(6);
                    int[] iArr = new int[2];
                    onTouch = this.bioController.onTouch(x, y, eventTime, iArr);
                    i = iArr[0];
                    this.progressController.installMax(iArr[1]);
                }
                if (onTouch < 0) {
                    this.bioController.endDialog(1, null);
                    return false;
                }
                this.progressController.installProgress(i);
                if (onTouch != 0) {
                    this.isFinished = true;
                    this.bioController.endDialog(0, null);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setBioProgressController(CspBioProgressController cspBioProgressController) {
        this.progressController = cspBioProgressController;
        if (isBioAnalysisEnabled()) {
            cspBioProgressController.installMax(1000);
        }
    }

    public void setDialogController(ICSPBioController iCSPBioController) {
        this.bioController = iCSPBioController;
    }

    public void setFinished() {
        synchronized (this.LOCK) {
            this.isFinished = true;
        }
    }
}
