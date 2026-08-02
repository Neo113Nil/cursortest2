package ru.yandex.taxi.logistics.sdk.network;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.an2;
import defpackage.cpc;
import defpackage.dpc;
import defpackage.epc;
import defpackage.fo2;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.kwj0;
import defpackage.ls50;
import defpackage.ny61;
import defpackage.ps50;
import defpackage.tls;
import defpackage.w511;
import defpackage.y6o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.network.error_dialog.ErrorDialogDto;
import ru.yandex.taxi.logistics.sdk.network.error_dialog.ErrorMessageDto;

/* loaded from: classes9.dex */
public abstract class c {
    public static final JsonAdapter e;
    public static final JsonAdapter f;
    public static final long g;
    public static final long h;
    public final kwj0 a;
    public final int b;
    public final long c;
    public final long d;

    static {
        Moshi build = new Moshi.Builder().build();
        e = build.adapter(ErrorDialogDto.class);
        f = build.adapter(ErrorMessageDto.class);
        g = 2000L;
        h = 10000L;
    }

    public c(kwj0 kwj0Var, long j, int i) {
        int i2 = (i & 2) != 0 ? 3 : 1;
        j = (i & 8) != 0 ? h : j;
        this.a = kwj0Var;
        this.b = i2;
        this.c = g;
        this.d = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r11 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004a, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, Continuation continuation) {
        BaseDataSource$getResult$1 baseDataSource$getResult$1;
        int i;
        if (continuation instanceof BaseDataSource$getResult$1) {
            baseDataSource$getResult$1 = (BaseDataSource$getResult$1) continuation;
            int i2 = baseDataSource$getResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseDataSource$getResult$1.label = i2 - Integer.MIN_VALUE;
                BaseDataSource$getResult$1 baseDataSource$getResult$12 = baseDataSource$getResult$1;
                Object obj = baseDataSource$getResult$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseDataSource$getResult$12.label;
                y6o y6oVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    baseDataSource$getResult$12.L$0 = null;
                    baseDataSource$getResult$12.label = 1;
                    obj = tlsVar.invoke(baseDataSource$getResult$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        io2 io2Var = (io2) obj;
                        if (io2Var instanceof ho2) {
                            ho2 ho2Var = (ho2) io2Var;
                            return new dpc(this.a.a(ho2Var.a), ho2Var.b);
                        }
                        if (!(io2Var instanceof go2)) {
                            w511.b();
                            return null;
                        }
                        go2 go2Var = (go2) io2Var;
                        ps50 ps50Var = go2Var.a;
                        fo2 fo2Var = go2Var.b;
                        if (!(ps50Var instanceof ls50)) {
                            return new epc(fo2Var);
                        }
                        ls50 ls50Var = (ls50) ps50Var;
                        int i3 = ls50Var.a;
                        String str = ls50Var.b;
                        if (str != null) {
                            try {
                                try {
                                    ErrorDialogDto errorDialogDto = (ErrorDialogDto) e.fromJson(str);
                                    if (errorDialogDto != null) {
                                        y6oVar = new y6o(errorDialogDto.getText(), errorDialogDto.getTitle(), errorDialogDto.getButtonText());
                                    }
                                } catch (Exception unused) {
                                    ErrorMessageDto errorMessageDto = (ErrorMessageDto) f.fromJson(str);
                                    if (errorMessageDto != null) {
                                        y6oVar = new y6o(errorMessageDto.getMessage());
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        return new cpc(y6oVar, Integer.valueOf(i3), fo2Var);
                    }
                    kotlin.b.b(obj);
                }
                baseDataSource$getResult$12.L$0 = null;
                baseDataSource$getResult$12.label = 2;
                obj = ((b) ((an2) obj)).c(this.b, this.c, this.d, baseDataSource$getResult$12);
            }
        }
        baseDataSource$getResult$1 = new BaseDataSource$getResult$1(this, continuation);
        BaseDataSource$getResult$1 baseDataSource$getResult$122 = baseDataSource$getResult$1;
        Object obj3 = baseDataSource$getResult$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseDataSource$getResult$122.label;
        y6o y6oVar2 = null;
        if (i != 0) {
        }
        baseDataSource$getResult$122.L$0 = null;
        baseDataSource$getResult$122.label = 2;
        obj3 = ((b) ((an2) obj3)).c(this.b, this.c, this.d, baseDataSource$getResult$122);
    }
}
