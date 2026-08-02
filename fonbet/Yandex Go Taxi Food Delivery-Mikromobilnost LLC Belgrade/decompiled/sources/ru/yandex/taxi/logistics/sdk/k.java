package ru.yandex.taxi.logistics.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.bvf0;
import defpackage.g16;
import defpackage.iej;
import defpackage.jy60;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.ohz;
import defpackage.pav;
import defpackage.qej;
import defpackage.tje;
import defpackage.tse;
import defpackage.uq1;
import defpackage.w030;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes9.dex */
public final class k implements jy60 {
    public final tse a;
    public final Context b;
    public final uq1 c;
    public final k7x0 d;
    public final pav e;
    public final w030 f;

    public k(tse tseVar, Context context, uq1 uq1Var, k7x0 k7x0Var, pav pavVar, w030 w030Var) {
        this.a = tseVar;
        this.b = context;
        this.c = uq1Var;
        this.d = k7x0Var;
        this.e = pavVar;
        this.f = w030Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(k kVar, iej iejVar, Continuation continuation) {
        LogisticsDialogManagerDelegate$showAlertDialog$1 logisticsDialogManagerDelegate$showAlertDialog$1;
        int i;
        AlertDialog a;
        AlertDialog alertDialog;
        Bitmap bitmap;
        kVar.getClass();
        if (continuation instanceof LogisticsDialogManagerDelegate$showAlertDialog$1) {
            logisticsDialogManagerDelegate$showAlertDialog$1 = (LogisticsDialogManagerDelegate$showAlertDialog$1) continuation;
            int i2 = logisticsDialogManagerDelegate$showAlertDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logisticsDialogManagerDelegate$showAlertDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logisticsDialogManagerDelegate$showAlertDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logisticsDialogManagerDelegate$showAlertDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = kVar.c.a();
                    qej a2 = iejVar.a();
                    CharSequence b = a2.b();
                    if (b != null) {
                        a.setMessage(b);
                    }
                    CharSequence f = a2.f();
                    if (f != null) {
                        a.setTitle(f);
                    }
                    a.setCancelable(a2.h());
                    a.setDismissListener(new ohz(iejVar, 2));
                    CharSequence e = a2.e();
                    if (e != null) {
                        a.setMainActionButton(e, new ohz(iejVar, 3));
                    }
                    CharSequence c = a2.c();
                    if (c != null) {
                        a.addButton(c, new ohz(iejVar, 4));
                    }
                    CharSequence d = a2.d();
                    if (d != null) {
                        a.addButton(d, new ohz(iejVar, 5));
                    }
                    String a3 = a2.a();
                    if (a3 != null) {
                        g16 b2 = kVar.e.b().b(((m7x0) kVar.d).a(a3));
                        logisticsDialogManagerDelegate$showAlertDialog$1.L$0 = null;
                        logisticsDialogManagerDelegate$showAlertDialog$1.L$1 = a;
                        logisticsDialogManagerDelegate$showAlertDialog$1.L$2 = null;
                        logisticsDialogManagerDelegate$showAlertDialog$1.L$3 = null;
                        logisticsDialogManagerDelegate$showAlertDialog$1.L$4 = null;
                        logisticsDialogManagerDelegate$showAlertDialog$1.label = 1;
                        Object b3 = ru.yandex.taxi.utils.a.b(b2, logisticsDialogManagerDelegate$showAlertDialog$1);
                        if (b3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = b3;
                        alertDialog = a;
                    }
                    a.show();
                    xw31.w(a);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                alertDialog = (AlertDialog) logisticsDialogManagerDelegate$showAlertDialog$1.L$1;
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    alertDialog.setDialogDrawable(new BitmapDrawable(kVar.b.getResources(), bitmap));
                }
                a = alertDialog;
                a.show();
                xw31.w(a);
                return zy11.a;
            }
        }
        logisticsDialogManagerDelegate$showAlertDialog$1 = new LogisticsDialogManagerDelegate$showAlertDialog$1(kVar, continuation);
        Object obj2 = logisticsDialogManagerDelegate$showAlertDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logisticsDialogManagerDelegate$showAlertDialog$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        a = alertDialog;
        a.show();
        xw31.w(a);
        return zy11.a;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LogisticsDialogManagerDelegate";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new LogisticsDialogManagerDelegate$onFirstContentfulPaint$1(bvf0.m(), this, null), 3);
    }
}
