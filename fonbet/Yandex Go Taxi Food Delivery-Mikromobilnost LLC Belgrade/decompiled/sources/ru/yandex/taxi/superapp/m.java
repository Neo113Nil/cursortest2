package ru.yandex.taxi.superapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.core.content.FileProvider;
import defpackage.bvf0;
import defpackage.gcn;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jst;
import defpackage.me0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.og21;
import defpackage.pav;
import defpackage.r5f0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zch;
import defpackage.zjr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class m {
    public final Context a;
    public final zch b;
    public final r5f0 c;
    public final me0 d;
    public final ru.yandex.taxi.activity.g e;
    public final tt2 f;
    public final ike g;
    public final AtomicBoolean h;

    public m(Context context, zch zchVar, r5f0 r5f0Var, me0 me0Var, ru.yandex.taxi.activity.g gVar, tt2 tt2Var) {
        this.a = context;
        this.b = zchVar;
        this.c = r5f0Var;
        this.d = me0Var;
        this.e = gVar;
        this.f = tt2Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.g = bvf0.a(o400.a);
        this.h = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable a(m mVar, String str, ContinuationImpl continuationImpl) {
        SuperAppShareDelegate$processImageUrl$1 superAppShareDelegate$processImageUrl$1;
        int i;
        Bitmap bitmap;
        mVar.getClass();
        if (continuationImpl instanceof SuperAppShareDelegate$processImageUrl$1) {
            superAppShareDelegate$processImageUrl$1 = (SuperAppShareDelegate$processImageUrl$1) continuationImpl;
            int i2 = superAppShareDelegate$processImageUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppShareDelegate$processImageUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppShareDelegate$processImageUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppShareDelegate$processImageUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zch zchVar = mVar.b;
                    superAppShareDelegate$processImageUrl$1.L$0 = str;
                    superAppShareDelegate$processImageUrl$1.label = 1;
                    obj = !og21.b(Uri.parse(str)) ? null : ru.yandex.taxi.utils.a.b(((pav) zchVar.a).b().b(str), superAppShareDelegate$processImageUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) superAppShareDelegate$processImageUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    r5f0 r5f0Var = mVar.c;
                    if (jl40.l(Uri.parse(str).getScheme(), Constants.KEY_DATA)) {
                        try {
                            byte[] decode = Base64.decode(((Regex) r5f0Var.a.getValue()).j(str, ""), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } catch (Exception unused) {
                            jst.e.j(new IllegalArgumentException("Error decoding byteArray to bitmap"));
                        }
                    }
                    bitmap = null;
                }
                if (bitmap != null) {
                    ny61.r("Required value was null.");
                    return null;
                }
                Context context = mVar.d.a;
                String str2 = UUID.randomUUID() + "_image_share";
                if (!new File(context.getCacheDir(), "eatskit_share").exists()) {
                    new File(context.getCacheDir(), "eatskit_share").mkdirs();
                }
                File file = new File(new File(context.getCacheDir(), "eatskit_share"), str2.concat(".jpg"));
                if (!file.exists()) {
                    file.createNewFile();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return FileProvider.getUriForFile(context, "ru.yandex.taxi.utils.fileprovider." + context.getPackageName(), file);
                } finally {
                }
            }
        }
        superAppShareDelegate$processImageUrl$1 = new SuperAppShareDelegate$processImageUrl$1(mVar, continuationImpl);
        Object obj2 = superAppShareDelegate$processImageUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppShareDelegate$processImageUrl$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
        if (bitmap != null) {
        }
    }

    public final void b(zjr0 zjr0Var, gcn gcnVar) {
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        tje.N(this.g, null, null, new SuperAppShareDelegate$shareImageList$1(this, zjr0Var, gcnVar, null), 3);
    }
}
