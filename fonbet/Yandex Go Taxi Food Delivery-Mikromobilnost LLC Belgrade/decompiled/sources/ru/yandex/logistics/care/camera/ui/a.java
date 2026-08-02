package ru.yandex.logistics.care.camera.ui;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aii0;
import defpackage.bts;
import defpackage.co7;
import defpackage.did;
import defpackage.fid;
import defpackage.jzd;
import defpackage.kv5;
import defpackage.lj1;
import defpackage.ljs0;
import defpackage.ls7;
import defpackage.n3z;
import defpackage.o430;
import defpackage.oz40;
import defpackage.pey;
import defpackage.sls;
import defpackage.tls;
import defpackage.w8v;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(w8v w8vVar, int i, float f, tls tlsVar, Config$CameraLens config$CameraLens, sls slsVar, jzd jzdVar, fid fidVar, int i2) {
        Config$CameraLens config$CameraLens2;
        w8v w8vVar2;
        int i3;
        bts btsVar;
        Context context;
        Continuation continuation;
        int i4;
        oz40 oz40Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1215442914);
        int i5 = i2 | (btsVar2.e(w8vVar) ? 4 : 2) | (btsVar2.c(i) ? 32 : 16) | (btsVar2.b(f) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024) | (btsVar2.c(config$CameraLens == null ? -1 : config$CameraLens.ordinal()) ? 16384 : 8192) | (btsVar2.e(slsVar) ? 131072 : 65536) | (btsVar2.k(jzdVar) ? 1048576 : 524288);
        if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
            Context context2 = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            pey peyVar = (pey) btsVar2.m(n3z.a);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                PreviewView previewView = new PreviewView(context2);
                previewView.setScaleType(PreviewView.ScaleType.FIT_CENTER);
                previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
                btsVar2.o0(previewView);
                obj = previewView;
            }
            PreviewView previewView2 = (PreviewView) obj;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(null);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            boolean e = btsVar2.e(context2) | btsVar2.e(previewView2) | ((i5 & HProv.ALG_CLASS_ALL) == 16384) | ((458752 & i5) == 131072) | btsVar2.e(peyVar) | btsVar2.e(w8vVar) | ((i5 & 7168) == 2048);
            Object Q3 = btsVar2.Q();
            if (e || Q3 == o430Var) {
                context = context2;
                continuation = null;
                i4 = i5;
                CameraPreviewKt$CameraPreview$2$1 cameraPreviewKt$CameraPreview$2$1 = new CameraPreviewKt$CameraPreview$2$1(context, config$CameraLens, slsVar, peyVar, w8vVar, tlsVar, previewView2, oz40Var2, null);
                config$CameraLens2 = config$CameraLens;
                oz40Var = oz40Var2;
                previewView2 = previewView2;
                w8vVar2 = w8vVar;
                btsVar2.o0(cameraPreviewKt$CameraPreview$2$1);
                Q3 = cameraPreviewKt$CameraPreview$2$1;
            } else {
                config$CameraLens2 = config$CameraLens;
                w8vVar2 = w8vVar;
                context = context2;
                oz40Var = oz40Var2;
                continuation = null;
                i4 = i5;
            }
            zpn.e(btsVar2, (wls) Q3, config$CameraLens2);
            Float valueOf = Float.valueOf(f);
            co7 co7Var = (co7) oz40Var.getValue();
            boolean z = (i4 & 896) == 256;
            Object Q4 = btsVar2.Q();
            if (z || Q4 == o430Var) {
                Q4 = new CameraPreviewKt$CameraPreview$3$1(f, oz40Var, continuation);
                btsVar2.o0(Q4);
            }
            zpn.f(valueOf, co7Var, (wls) Q4, btsVar2);
            co7 co7Var2 = (co7) oz40Var.getValue();
            boolean z2 = (3670016 & i4) == 1048576;
            Object Q5 = btsVar2.Q();
            if (z2 || Q5 == o430Var) {
                Q5 = new CameraPreviewKt$CameraPreview$4$1(jzdVar, oz40Var, continuation);
                btsVar2.o0(Q5);
            }
            zpn.f(co7Var2, jzdVar, (wls) Q5, btsVar2);
            Integer valueOf2 = Integer.valueOf(i);
            boolean e2 = btsVar2.e(w8vVar2) | ((i4 & 112) == 32);
            Object Q6 = btsVar2.Q();
            if (e2 || Q6 == o430Var) {
                i3 = i;
                Q6 = new CameraPreviewKt$CameraPreview$5$1(w8vVar2, i3, continuation);
                btsVar2.o0(Q6);
            } else {
                i3 = i;
            }
            zpn.e(btsVar2, (wls) Q6, valueOf2);
            boolean e3 = btsVar2.e(context);
            Object Q7 = btsVar2.Q();
            if (e3 || Q7 == o430Var) {
                Q7 = new lj1(context, 8);
                btsVar2.o0(Q7);
            }
            zpn.a(zy11.a, (tls) Q7, btsVar2);
            boolean e4 = btsVar2.e(previewView2);
            Object Q8 = btsVar2.Q();
            if (e4 || Q8 == o430Var) {
                Q8 = new kv5(28, previewView2);
                btsVar2.o0(Q8);
            }
            btsVar = btsVar2;
            androidx.compose.ui.viewinterop.b.a((tls) Q8, ljs0.c, null, btsVar, 48, 4);
        } else {
            config$CameraLens2 = config$CameraLens;
            w8vVar2 = w8vVar;
            i3 = i;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls7(w8vVar2, i3, f, tlsVar, config$CameraLens2, slsVar, jzdVar, i2);
        }
    }
}
