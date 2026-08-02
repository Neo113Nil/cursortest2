package org.altbeacon.beacon.service;

import android.content.Context;
import android.util.Log;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.i630;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class ScanState implements Serializable {
    public transient i630 a;
    public transient Context b;
    private long mBackgroundBetweenScanPeriod;
    private boolean mBackgroundMode;
    private long mBackgroundScanPeriod;
    private Set<BeaconParser> mBeaconParsers;
    private ExtraDataBeaconTracker mExtraBeaconDataTracker;
    private long mForegroundBetweenScanPeriod;
    private long mForegroundScanPeriod;
    private long mLastScanStartTimeMillis;
    private Map<Region, RangeState> mRangedRegionState;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[Catch: all -> 0x001d, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #14 {, blocks: (B:29:0x0019, B:16:0x0020, B:18:0x0073, B:19:0x0093, B:21:0x0097, B:22:0x009e, B:23:0x00b4, B:48:0x0058, B:38:0x006b, B:72:0x0060, B:65:0x0065, B:66:0x0068), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScanState n(Context context) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        ScanState scanState;
        Throwable e;
        FileInputStream fileInputStream;
        synchronized (ScanState.class) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = context.openFileInput("android-beacon-library-scan-state");
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    objectInputStream2 = new ObjectInputStream(fileInputStream);
                    try {
                        scanState = (ScanState) objectInputStream2.readObject();
                    } catch (FileNotFoundException unused) {
                        scanState = null;
                    } catch (IOException | ClassCastException | ClassNotFoundException e2) {
                        scanState = null;
                        e = e2;
                    }
                    try {
                        scanState.b = context;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (FileNotFoundException unused3) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                    } catch (IOException | ClassCastException | ClassNotFoundException e3) {
                        e = e3;
                        if (!(e instanceof InvalidClassException)) {
                            Log.e("ScanState", "error: ", e);
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                    }
                } catch (FileNotFoundException unused6) {
                    objectInputStream2 = null;
                    scanState = null;
                } catch (IOException | ClassCastException | ClassNotFoundException e4) {
                    scanState = null;
                    e = e4;
                    objectInputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (objectInputStream != null) {
                        throw th;
                    }
                    try {
                        objectInputStream.close();
                        throw th;
                    } catch (IOException unused8) {
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused9) {
                objectInputStream2 = null;
                scanState = null;
            } catch (IOException | ClassCastException | ClassNotFoundException e5) {
                objectInputStream2 = null;
                scanState = null;
                e = e5;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                if (fileInputStream2 != null) {
                }
                if (objectInputStream != null) {
                }
            }
            try {
                objectInputStream2.close();
            } catch (IOException unused10) {
            }
            if (scanState == null) {
                scanState = new ScanState();
                scanState.mRangedRegionState = new HashMap();
                scanState.mBeaconParsers = new HashSet();
                scanState.mExtraBeaconDataTracker = new ExtraDataBeaconTracker();
                scanState.mLastScanStartTimeMillis = 0L;
                scanState.b = context;
            }
            if (scanState.mExtraBeaconDataTracker == null) {
                scanState.mExtraBeaconDataTracker = new ExtraDataBeaconTracker();
            }
            i630 b = i630.b(context);
            scanState.a = b;
            b.e().size();
            scanState.mRangedRegionState.keySet().size();
        }
        return scanState;
    }

    public final void a(b bVar) {
        this.mBeaconParsers = new HashSet(bVar.i);
        this.mForegroundScanPeriod = bVar.u;
        this.mForegroundBetweenScanPeriod = bVar.v;
        this.mBackgroundScanPeriod = bVar.w;
        this.mBackgroundBetweenScanPeriod = bVar.x;
        this.mBackgroundMode = bVar.k;
        ArrayList arrayList = new ArrayList(this.a.e());
        ArrayList arrayList2 = new ArrayList(this.mRangedRegionState.keySet());
        ArrayList arrayList3 = new ArrayList(bVar.k());
        ArrayList arrayList4 = new ArrayList(Collections.unmodifiableSet(bVar.f));
        arrayList2.size();
        arrayList4.size();
        arrayList.size();
        arrayList3.size();
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (arrayList2.contains(region)) {
                Region region2 = (Region) arrayList2.get(arrayList2.indexOf(region));
                if (region.hasSameIdentifiers(region2)) {
                    this.mRangedRegionState.remove(region2);
                    Map<Region, RangeState> map = this.mRangedRegionState;
                    this.b.getPackageName();
                    map.put(region, new RangeState(new Callback()));
                }
            } else {
                Objects.toString(region);
                Map<Region, RangeState> map2 = this.mRangedRegionState;
                this.b.getPackageName();
                map2.put(region, new RangeState(new Callback()));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region3 = (Region) it2.next();
            if (!arrayList4.contains(region3)) {
                Objects.toString(region3);
                this.mRangedRegionState.remove(region3);
            }
        }
        arrayList4.size();
        arrayList3.size();
        p();
    }

    public final Long b() {
        return Long.valueOf(this.mBackgroundBetweenScanPeriod);
    }

    public final Boolean c() {
        return Boolean.valueOf(this.mBackgroundMode);
    }

    public final Long f() {
        return Long.valueOf(this.mBackgroundScanPeriod);
    }

    public final Set g() {
        return this.mBeaconParsers;
    }

    public final ExtraDataBeaconTracker h() {
        return this.mExtraBeaconDataTracker;
    }

    public final Long i() {
        return Long.valueOf(this.mForegroundBetweenScanPeriod);
    }

    public final Long j() {
        return Long.valueOf(this.mForegroundScanPeriod);
    }

    public final Map k() {
        return this.mRangedRegionState;
    }

    public final int l() {
        long j;
        long j2;
        if (this.mBackgroundMode) {
            j = this.mBackgroundScanPeriod;
            j2 = this.mBackgroundBetweenScanPeriod;
        } else {
            j = this.mForegroundScanPeriod;
            j2 = this.mForegroundBetweenScanPeriod;
        }
        long j3 = j + j2;
        if (j3 > MapiClientImpl.RETRIES_TIME_MILLIS) {
            return (int) j3;
        }
        return 300000;
    }

    public final int m() {
        long j = this.mBackgroundMode ? this.mBackgroundScanPeriod : this.mForegroundScanPeriod;
        if (this.mBackgroundMode || j >= MapiClientImpl.RETRIES_TIME_MILLIS) {
            return (int) j;
        }
        return 300000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        ObjectOutputStream objectOutputStream;
        synchronized (ScanState.class) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream openFileOutput = this.b.openFileOutput("android-beacon-library-scan-state-temp", 0);
                try {
                    objectOutputStream = new ObjectOutputStream(openFileOutput);
                } catch (IOException unused) {
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                }
                try {
                    objectOutputStream.writeObject(this);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (IOException unused3) {
                    fileOutputStream = openFileOutput;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = openFileOutput;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (objectOutputStream == null) {
                        throw th;
                    }
                    try {
                        objectOutputStream.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
            } catch (IOException unused7) {
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused8) {
            }
            File file = new File(this.b.getFilesDir(), "android-beacon-library-scan-state");
            File file2 = new File(this.b.getFilesDir(), "android-beacon-library-scan-state-temp");
            file2.getAbsolutePath();
            file.getAbsolutePath();
            file.delete();
            file2.renameTo(file);
            this.a.g();
        }
    }

    public final void q(long j) {
        this.mLastScanStartTimeMillis = j;
    }
}
