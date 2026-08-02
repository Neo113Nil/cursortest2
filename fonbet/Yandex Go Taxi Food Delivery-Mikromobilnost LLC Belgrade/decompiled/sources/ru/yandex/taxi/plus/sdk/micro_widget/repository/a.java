package ru.yandex.taxi.plus.sdk.micro_widget.repository;

import defpackage.b7z0;
import defpackage.cmt;
import defpackage.cqd0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ruc0;
import defpackage.soc0;
import defpackage.u0d0;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.plus.api.PlusApi;

/* loaded from: classes6.dex */
public final class a {
    public final b7z0 a;
    public final PlusApi b;
    public final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    public String d;

    public a(u0d0 u0d0Var, cqd0 cqd0Var) {
        this.a = cqd0Var;
        this.b = u0d0Var.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(3:16|(2:18|(3:20|21|(1:23)))|24)))|28|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, soc0 soc0Var, String str2, ContinuationImpl continuationImpl) {
        SeenPlaquesRepository$seenPlaque$1 seenPlaquesRepository$seenPlaque$1;
        int i;
        if (continuationImpl instanceof SeenPlaquesRepository$seenPlaque$1) {
            seenPlaquesRepository$seenPlaque$1 = (SeenPlaquesRepository$seenPlaque$1) continuationImpl;
            int i2 = seenPlaquesRepository$seenPlaque$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seenPlaquesRepository$seenPlaque$1.label = i2 - Integer.MIN_VALUE;
                Object obj = seenPlaquesRepository$seenPlaque$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = seenPlaquesRepository$seenPlaque$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                if (!jl40.l(str, this.d)) {
                    this.d = str;
                    if (soc0Var.b) {
                        cmt<zy11> b = this.b.b(new ruc0(str, this.c.format(new Date(this.a.a())), str2, soc0Var.c));
                        seenPlaquesRepository$seenPlaque$1.L$0 = null;
                        seenPlaquesRepository$seenPlaque$1.L$1 = null;
                        seenPlaquesRepository$seenPlaque$1.L$2 = null;
                        seenPlaquesRepository$seenPlaque$1.L$3 = null;
                        seenPlaquesRepository$seenPlaque$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.a(b, null, seenPlaquesRepository$seenPlaque$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        seenPlaquesRepository$seenPlaque$1 = new SeenPlaquesRepository$seenPlaque$1(this, continuationImpl);
        Object obj2 = seenPlaquesRepository$seenPlaque$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = seenPlaquesRepository$seenPlaque$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
