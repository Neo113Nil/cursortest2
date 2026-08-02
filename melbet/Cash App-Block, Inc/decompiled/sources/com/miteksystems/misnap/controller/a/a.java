package com.miteksystems.misnap.controller.a;

import android.content.Context;
import com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.core.Vds;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements a0 {
    public final MiSnapBarcodeAnalyzer a;

    public a(Context context, MiSnapSettings.Analysis.Barcode barcode, String str) {
        barcode.getClass();
        str.getClass();
        this.a = new MiSnapBarcodeAnalyzer(context, barcode, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 != null ? r2.b : null) == null) goto L14;
     */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        MiSnapBarcodeAnalyzer.Result.Processed analyze = this.a.analyze(frame);
        if (!(analyze instanceof MiSnapBarcodeAnalyzer.Result.Processed)) {
            if (analyze instanceof MiSnapBarcodeAnalyzer.Result.Failure) {
                throw new c(new MiSnapController.ErrorResult.BarcodeAnalysis((MiSnapBarcodeAnalyzer.Result.Failure) analyze));
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        MiSnapBarcodeAnalyzer.Result.Processed processed = analyze;
        Barcode barcode = processed.getBarcode();
        if ((barcode != null ? barcode.a : null) != null) {
            Barcode barcode2 = processed.getBarcode();
        }
        if (!a(processed)) {
            return new b(UserAction.Barcode.NOT_FOUND.INSTANCE, null, processed.getLicenseExpired());
        }
        return new b(UserAction.NONE.INSTANCE, processed.getBarcode(), processed.getLicenseExpired());
    }

    public static boolean a(MiSnapBarcodeAnalyzer.Result.Processed processed) {
        Vds vds;
        Barcode barcode = processed.getBarcode();
        if (barcode != null ? Intrinsics.areEqual(barcode.d, Boolean.TRUE) : false) {
            Barcode barcode2 = processed.getBarcode();
            String str = null;
            if ((barcode2 != null ? barcode2.e : null) != null) {
                Barcode barcode3 = processed.getBarcode();
                if (barcode3 != null && (vds = barcode3.e) != null) {
                    str = vds.b;
                }
                if (str != null && str.length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.a.release();
    }
}
