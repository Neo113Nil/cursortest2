package ru.domesticroots.certificatetransparency.cache;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.g3r;
import defpackage.jpg;
import defpackage.m9i0;
import defpackage.n9i0;
import defpackage.ny61;
import defpackage.tez;
import defpackage.xh91;
import defpackage.yvi0;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements jpg {
    public final String a;
    public final SharedPreferences b;

    public a(Context context, tez tezVar) {
        this.a = context.getCacheDir().getPath() + "/certificate-transparency-android";
        this.b = context.getApplicationContext().getSharedPreferences("certificate-transparency", 0);
    }

    public final Object a(n9i0 n9i0Var) {
        boolean z;
        if (n9i0Var instanceof m9i0) {
            Date date = new Date(this.b.getLong("last_write", System.currentTimeMillis()));
            Date date2 = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, 30);
            if (!date2.after(calendar.getTime())) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(3:10|11|12)(2:20|21))(5:22|23|(1:25)(1:30)|26|(1:28)(1:29))|13|(1:15)(2:17|18)))|32|6|7|(0)(0)|13|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: IOException -> 0x0098, TRY_LEAVE, TryCatch #0 {IOException -> 0x0098, blocks: (B:11:0x0036, B:13:0x007c, B:17:0x0085, B:23:0x0045, B:25:0x005d, B:26:0x0063), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.jpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AndroidDiskCache$get$1 androidDiskCache$get$1;
        Object obj;
        int i;
        m9i0 m9i0Var;
        File file;
        File file2;
        String str = this.a;
        if (continuationImpl instanceof AndroidDiskCache$get$1) {
            androidDiskCache$get$1 = (AndroidDiskCache$get$1) continuationImpl;
            int i2 = androidDiskCache$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDiskCache$get$1.label = i2 - Integer.MIN_VALUE;
                obj = androidDiskCache$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidDiskCache$get$1.label;
                if (i != 0) {
                    b.b(obj);
                    File file3 = new File(str, "loglist.json");
                    File file4 = new File(str, "loglist.sig");
                    m9i0Var = new m9i0(g3r.c(file3), file4.exists() ? g3r.c(file4) : null);
                    androidDiskCache$get$1.L$0 = this;
                    androidDiskCache$get$1.L$1 = file3;
                    androidDiskCache$get$1.L$2 = file4;
                    androidDiskCache$get$1.L$3 = m9i0Var;
                    androidDiskCache$get$1.label = 1;
                    Object a = a(m9i0Var);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    file = file3;
                    obj = a;
                    file2 = file4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m9i0 m9i0Var2 = (m9i0) androidDiskCache$get$1.L$3;
                    file2 = (File) androidDiskCache$get$1.L$2;
                    file = (File) androidDiskCache$get$1.L$1;
                    a aVar = (a) androidDiskCache$get$1.L$0;
                    b.b(obj);
                    m9i0Var = m9i0Var2;
                    this = aVar;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return m9i0Var;
                }
                this.b.edit().clear().apply();
                file.delete();
                file2.delete();
                return null;
            }
        }
        androidDiskCache$get$1 = new AndroidDiskCache$get$1(this, continuationImpl);
        obj = androidDiskCache$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidDiskCache$get$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.jpg
    public final /* bridge */ /* synthetic */ Object d(Object obj, Continuation continuation) {
        return a((n9i0) obj);
    }

    @Override // defpackage.jpg
    public final ru.domesticroots.certificatetransparency.datasource.a j(yvi0 yvi0Var) {
        return xh91.a(this, yvi0Var);
    }

    @Override // defpackage.jpg
    public final Object k(Object obj, ContinuationImpl continuationImpl) {
        n9i0 n9i0Var = (n9i0) obj;
        String str = this.a;
        if (n9i0Var instanceof m9i0) {
            try {
                new File(str).mkdirs();
                g3r.f(new File(str, "loglist.json"), ((m9i0) n9i0Var).c());
                byte[] d = ((m9i0) n9i0Var).d();
                if (d != null) {
                    g3r.f(new File(str, "loglist.sig"), d);
                }
                this.b.edit().putLong("last_write", System.currentTimeMillis()).apply();
            } catch (IOException unused) {
            }
        }
        return zy11.a;
    }
}
