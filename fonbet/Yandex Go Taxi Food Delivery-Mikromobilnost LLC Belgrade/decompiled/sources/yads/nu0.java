package yads;

import defpackage.er00;
import defpackage.g050;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yz71;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class nu0 extends SuspendLambda implements wls {
    public g050 b;
    public yz71 c;
    public zu0 d;
    public byte[] e;
    public int f;
    public final /* synthetic */ yz71 g;
    public final /* synthetic */ zu0 h;
    public final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(yz71 yz71Var, zu0 zu0Var, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.g = yz71Var;
        this.h = zu0Var;
        this.i = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new nu0(this.g, this.h, this.i, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((nu0) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        yz71 yz71Var;
        zu0 zu0Var;
        byte[] bArr;
        File file;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f;
        if (i == 0) {
            b.b(obj);
            yz71 yz71Var2 = this.g;
            zu0 zu0Var2 = this.h;
            byte[] bArr2 = yz71.d;
            g050 g050Var2 = (g050) yz71Var2.b.computeIfAbsent(zu0Var2, new er00(2, mu0.w));
            yz71 yz71Var3 = this.g;
            zu0 zu0Var3 = this.h;
            byte[] bArr3 = this.i;
            this.b = g050Var2;
            this.c = yz71Var3;
            this.d = zu0Var3;
            this.e = bArr3;
            this.f = 1;
            if (g050Var2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = g050Var2;
            yz71Var = yz71Var3;
            zu0Var = zu0Var3;
            bArr = bArr3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArr = this.e;
            zu0Var = this.d;
            yz71Var = this.c;
            g050Var = this.b;
            b.b(obj);
        }
        try {
            byte[] bArr4 = yz71.d;
            File b = yz71Var.b(zu0Var);
            if (!b.exists() || !yz71.a(b)) {
                try {
                    ((File) yz71Var.c.getValue()).mkdirs();
                    file = yz71Var.c(zu0Var);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception unused) {
                    try {
                        yz71Var.c(zu0Var).delete();
                    } catch (Exception unused2) {
                    }
                    file = null;
                }
                if (file != null) {
                    if (!yz71.a(file) || !file.renameTo(b)) {
                        try {
                            file.delete();
                        } catch (Exception unused3) {
                        }
                    }
                }
                b = null;
            }
            return b;
        } finally {
            g050Var.d(null);
        }
    }
}
