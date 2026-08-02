package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.ai_camera;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.kv5;
import defpackage.ljs0;
import defpackage.n3z;
import defpackage.pey;
import defpackage.tls;
import defpackage.w8v;
import defpackage.wls;
import defpackage.z4;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(w8v w8vVar, int i, fid fidVar, int i2) {
        w8v w8vVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1721206077);
        int i3 = (btsVar.e(w8vVar) ? 4 : 2) | i2 | (btsVar.c(i) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            pey peyVar = (pey) btsVar.m(n3z.a);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = new PreviewView(context);
                btsVar.o0(Q);
            }
            PreviewView previewView = (PreviewView) Q;
            boolean e = btsVar.e(context) | btsVar.e(previewView) | btsVar.e(peyVar) | btsVar.e(w8vVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == obj) {
                w8vVar2 = w8vVar;
                Q2 = new AiCameraPreviewKt$CameraPreview$1$1(context, peyVar, w8vVar2, previewView, null);
                btsVar.o0(Q2);
            } else {
                w8vVar2 = w8vVar;
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            Integer valueOf = Integer.valueOf(i);
            boolean e2 = btsVar.e(w8vVar2) | ((i3 & 112) == 32);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == obj) {
                Q3 = new AiCameraPreviewKt$CameraPreview$2$1(w8vVar2, i, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, valueOf);
            boolean e3 = btsVar.e(previewView);
            Object Q4 = btsVar.Q();
            if (e3 || Q4 == obj) {
                Q4 = new kv5(28, previewView);
                btsVar.o0(Q4);
            }
            b.a((tls) Q4, ljs0.c, null, btsVar, 48, 4);
        } else {
            w8vVar2 = w8vVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(w8vVar2, i, i2, 3);
        }
    }
}
