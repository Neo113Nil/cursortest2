package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class zrr implements uxa1 {
    public Object a;
    public Object b;
    public boolean c;
    public boolean w;
    public final Object x;
    public Object y;

    public zrr(ArrayList arrayList, String str, List list, boolean z, hz01 hz01Var, boolean z2) {
        this.a = arrayList;
        this.b = str;
        this.x = list;
        this.c = z;
        this.y = hz01Var;
        this.w = z2;
    }

    @Override // defpackage.uxa1
    public njy0 a(xzv xzvVar) {
        fsy0 fsy0Var = (fsy0) this.y;
        if (((zzuv) this.a) == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) this.a;
        cvw.l(zzuvVar);
        if (!this.c) {
            try {
                zzuvVar.zze();
                this.c = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init text recognizer ".concat(fsy0Var.b()));
            }
        }
        try {
            return new njy0(zzuvVar.zzd(dab1.i(xzvVar), new zzuq(xzvVar.g, xzvVar.d, xzvVar.e, qnc.a(xzvVar.f), SystemClock.elapsedRealtime())), xzvVar.h);
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run text recognizer ".concat(fsy0Var.b()));
        }
    }

    @Override // defpackage.uxa1
    public void zzb() {
        zzuv zzd;
        o oVar = (o) this.b;
        Context context = (Context) this.x;
        fsy0 fsy0Var = (fsy0) this.y;
        if (((zzuv) this.a) != null) {
            return;
        }
        try {
            if (fsy0Var.a()) {
                zzd = zzux.zza(gan.c(context, gan.c, true != fsy0Var.a() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin").b("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(context), new zzvh(fsy0Var.b, "optional-module-text-latin", null, true, 1, "en", false));
            } else {
                zzd = zzux.zza(gan.c(context, gan.b, true != fsy0Var.a() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin").b("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator")).zzd(ObjectWrapper.wrap(context));
            }
            this.a = zzd;
            oVar.b(new wvb1(fsy0Var.a(), zzou.NO_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e) {
            oVar.b(new wvb1(fsy0Var.a(), zzou.OPTIONAL_MODULE_INIT_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
            throw new MlKitException(13, e, "Failed to create text recognizer ".concat(fsy0Var.b()));
        } catch (DynamiteModule$LoadingException e2) {
            oVar.b(new wvb1(fsy0Var.a(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE), zzov.ON_DEVICE_TEXT_LOAD);
            if (fsy0Var.a()) {
                throw new MlKitException(13, e2, b64.l("Failed to load text module ", fsy0Var.b(), ". ", e2.getMessage()));
            }
            if (!this.w) {
                bg70.d(context, fsy0Var.a() ? bg70.a : new Feature[]{bg70.d});
                this.w = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // defpackage.uxa1
    public void zzc() {
        zzuv zzuvVar = (zzuv) this.a;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(((fsy0) this.y).b()), e);
            }
            this.a = null;
        }
        this.c = false;
    }

    public zrr(Context context, fsy0 fsy0Var, o oVar) {
        this.x = context;
        this.y = fsy0Var;
        this.b = oVar;
    }

    public zrr(Context context) {
        this.c = true;
        this.w = false;
        this.x = context;
    }
}
