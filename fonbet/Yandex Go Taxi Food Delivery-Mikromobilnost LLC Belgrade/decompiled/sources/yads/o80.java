package yads;

import android.content.Context;
import android.util.Base64;
import androidx.core.content.FileProvider;
import defpackage.bo81;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.dj9;
import defpackage.g3r;
import defpackage.hu81;
import defpackage.k181;
import defpackage.kc71;
import defpackage.ko61;
import defpackage.nf71;
import defpackage.ny61;
import defpackage.sa71;
import defpackage.sbx;
import defpackage.tcc;
import defpackage.uza;
import defpackage.wg61;
import defpackage.wls;
import defpackage.wn81;
import defpackage.xk81;
import defpackage.yu71;
import defpackage.yw81;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;

/* loaded from: classes7.dex */
public final class o80 extends SuspendLambda implements wls {
    public xk81 b;
    public bo81 c;
    public int d;
    public final /* synthetic */ k181 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(k181 k181Var, Continuation continuation) {
        super(2, continuation);
        this.e = k181Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o80(this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new o80(this.e, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xk81 a;
        bo81 bo81Var;
        Object obj2;
        List list;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            b.b(obj);
            a = this.e.a.a();
            bo81 bo81Var2 = a.f;
            if (bo81Var2 == null) {
                return yw81.a;
            }
            sa71 sa71Var = this.e.b;
            this.b = a;
            this.c = bo81Var2;
            this.d = 1;
            Object a2 = sa71Var.a(this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bo81Var = bo81Var2;
            obj2 = a2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bo81Var = this.c;
            a = this.b;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        kc71 kc71Var = (kc71) obj2;
        if (kc71Var == null || (list = kc71Var.g) == null) {
            list = EmptyList.a;
        }
        ArrayList arrayList = a.c;
        ArrayList a3 = this.e.c.a(list);
        yu71 yu71Var = new yu71(a.a, a.b, a3.isEmpty() ? arrayList : a3, a.d, bo81Var.a, bo81Var.b);
        sbx sbxVar = this.e.d.a;
        sbx.d.getClass();
        yu71.Companion.getClass();
        try {
            failure = Base64.encodeToString(sbxVar.c(yu71Var, nf71.a).getBytes(uza.a), 2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str = (String) (failure instanceof Result.Failure ? null : failure);
        if (str == null) {
            str = "";
        }
        ArrayList l0 = a.l0(new dj9('A', 'Z'), new dj9('a', 'z'));
        d6w d6wVar = new d6w(1, 3, 1);
        ArrayList arrayList2 = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            it.nextInt();
            Character ch = (Character) a.p0(l0, Random.a);
            ch.getClass();
            arrayList2.add(ch);
        }
        String concat = a.X(arrayList2, "", null, null, null, 62).concat(str);
        ko61 ko61Var = this.e.e;
        Context context = ko61Var.a;
        try {
            wn81 wn81Var = ko61Var.b;
            wn81Var.getClass();
            File file = new File(wn81Var.a.getCacheDir(), "debug_panel");
            file.mkdir();
            File file2 = new File(file, "monetization_ads_debug_panel_report.txt");
            File parentFile = file2.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = concat.getBytes(uza.a);
            if (bytes.length >= freeSpace) {
                return new hu81("Not enough space error");
            }
            g3r.f(file2, bytes);
            return new wg61(FileProvider.getUriForFile(context, context.getPackageName() + ".monetization.ads.inspector.fileprovider", file2));
        } catch (Exception unused) {
            return new hu81("Failed to save report");
        }
    }
}
