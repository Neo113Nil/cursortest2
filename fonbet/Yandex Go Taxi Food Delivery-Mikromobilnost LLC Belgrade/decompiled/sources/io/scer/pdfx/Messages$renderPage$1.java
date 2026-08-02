package io.scer.pdfx;

import android.graphics.Bitmap;
import android.graphics.Color;
import defpackage.g6u;
import defpackage.jrb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p690;
import defpackage.r1b1;
import defpackage.r690;
import defpackage.sjh;
import defpackage.srb0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "io.scer.pdfx.Messages$renderPage$1", f = "Messages.kt", l = {224, 231}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class Messages$renderPage$1 extends SuspendLambda implements wls {
    final /* synthetic */ jrb0.h $message;
    final /* synthetic */ srb0 $result;
    final /* synthetic */ jrb0.i $resultResponse;
    int I$0;
    int I$1;
    int I$10;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    int I$7;
    int I$8;
    int I$9;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "io.scer.pdfx.Messages$renderPage$1$1", f = "Messages.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.scer.pdfx.Messages$renderPage$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ p690 $pageImage;
        final /* synthetic */ srb0 $result;
        final /* synthetic */ jrb0.i $resultResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jrb0.i iVar, p690 p690Var, srb0 srb0Var, Continuation continuation) {
            super(2, continuation);
            this.$resultResponse = iVar;
            this.$pageImage = p690Var;
            this.$result = srb0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$resultResponse, this.$pageImage, this.$result, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            jrb0.i iVar = this.$resultResponse;
            iVar.c = this.$pageImage.c;
            iVar.a = new Long(r0.a);
            this.$resultResponse.b = new Long(this.$pageImage.b);
            this.$result.success(this.$resultResponse);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "io.scer.pdfx.Messages$renderPage$1$2", f = "Messages.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.scer.pdfx.Messages$renderPage$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Exception $e;
        final /* synthetic */ srb0 $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(srb0 srb0Var, Exception exc, Continuation continuation) {
            super(2, continuation);
            this.$result = srb0Var;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$result, this.$e, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$result.c(new PdfRendererException("Unexpected error", this.$e));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Messages$renderPage$1(jrb0.h hVar, a aVar, srb0 srb0Var, jrb0.i iVar, Continuation continuation) {
        super(2, continuation);
        this.$message = hVar;
        this.this$0 = aVar;
        this.$result = srb0Var;
        this.$resultResponse = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Messages$renderPage$1 messages$renderPage$1 = new Messages$renderPage$1(this.$message, this.this$0, this.$result, this.$resultResponse, continuation);
        messages$renderPage$1.L$0 = obj;
        return messages$renderPage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Messages$renderPage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236 A[PHI: r1
      0x0236: PHI (r1v3 io.scer.pdfx.Messages$renderPage$1) = (r1v2 io.scer.pdfx.Messages$renderPage$1), (r1v17 io.scer.pdfx.Messages$renderPage$1) binds: [B:92:0x0234, B:85:0x01d9] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        boolean z;
        int i;
        String str;
        int i2;
        p690 p690Var;
        g6u g6uVar;
        AnonymousClass1 anonymousClass1;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Messages$renderPage$1 messages$renderPage$1 = this;
        ?? r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = messages$renderPage$1.label;
        zy11 zy11Var2 = zy11.a;
        Messages$renderPage$1 messages$renderPage$12 = null;
        try {
        } catch (Exception e) {
            e = e;
            messages$renderPage$12 = messages$renderPage$1;
            messages$renderPage$1 = r2;
            zy11Var = zy11Var2;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var2;
            }
            b.b(obj);
            return zy11Var2;
        }
        b.b(obj);
        jrb0.h hVar = messages$renderPage$1.$message;
        String str2 = hVar.a;
        if (str2 == null) {
            messages$renderPage$1.$result.c(new PdfRendererException("Page ID is null", null));
            return zy11Var2;
        }
        Long l5 = hVar.b;
        try {
        } catch (Exception e2) {
            e = e2;
        }
        if (l5 == null) {
            messages$renderPage$1.$result.c(new PdfRendererException("Width is null", null));
            return zy11Var2;
        }
        int longValue = (int) l5.longValue();
        Long l6 = messages$renderPage$1.$message.c;
        if (l6 == null) {
            messages$renderPage$1.$result.c(new PdfRendererException("Height is null", null));
            return zy11Var2;
        }
        int longValue2 = (int) l6.longValue();
        Long l7 = messages$renderPage$1.$message.d;
        int longValue3 = l7 != null ? (int) l7.longValue() : 1;
        String str3 = messages$renderPage$1.$message.e;
        int parseColor = str3 != null ? Color.parseColor(str3) : 0;
        Boolean bool = messages$renderPage$1.$message.f;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        int longValue4 = (!booleanValue || (l4 = messages$renderPage$1.$message.g) == null) ? 0 : (int) l4.longValue();
        int longValue5 = (!booleanValue || (l3 = messages$renderPage$1.$message.h) == null) ? 0 : (int) l3.longValue();
        if (!booleanValue || (l2 = messages$renderPage$1.$message.i) == null) {
            z = booleanValue;
            i = 0;
        } else {
            z = booleanValue;
            i = (int) l2.longValue();
        }
        int longValue6 = (!z || (l = messages$renderPage$1.$message.b) == null) ? 0 : (int) l.longValue();
        Long l8 = messages$renderPage$1.$message.k;
        if (l8 != null) {
            str = str2;
            i2 = (int) l8.longValue();
        } else {
            str = str2;
            i2 = 100;
        }
        Boolean bool2 = messages$renderPage$1.$message.l;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        r690 r690Var = (r690) messages$renderPage$1.this$0.c.a(str);
        String str4 = "jpg";
        if (longValue3 != 0) {
            if (longValue3 == 1) {
                str4 = "png";
            } else if (longValue3 == 2) {
                str4 = "webp";
            }
        }
        zy11Var = zy11Var2;
        try {
            try {
                File file = new File(messages$renderPage$1.this$0.a.a.getCacheDir(), "pdf_renderer_cache");
                file.mkdirs();
                boolean z2 = booleanValue2;
                try {
                    File file2 = new File(file, new Regex("-").j(UUID.randomUUID().toString(), "") + Extension.DOT_CHAR + str4);
                    Bitmap createBitmap = Bitmap.createBitmap(longValue, longValue2, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(parseColor);
                    r690Var.b.render(createBitmap, null, null, z2 ? 2 : 1);
                    if (!z || (longValue6 == longValue && i == longValue2)) {
                        r1b1.c(createBitmap, file2, longValue3, i2);
                        p690Var = new p690(longValue, longValue2, file2.getAbsolutePath());
                    } else {
                        r1b1.c(Bitmap.createBitmap(createBitmap, longValue4, longValue5, longValue6, i), file2, longValue3, i2);
                        p690Var = new p690(longValue6, i, file2.getAbsolutePath());
                    }
                    sjh sjhVar = uyj.a;
                    g6uVar = o400.a;
                    messages$renderPage$12 = this;
                } catch (Exception e3) {
                    e = e3;
                    messages$renderPage$12 = this;
                }
                try {
                    anonymousClass1 = new AnonymousClass1(messages$renderPage$12.$resultResponse, p690Var, messages$renderPage$12.$result, null);
                    messages$renderPage$12.L$0 = null;
                    messages$renderPage$12.L$1 = null;
                    messages$renderPage$12.L$2 = null;
                    messages$renderPage$12.L$3 = null;
                    messages$renderPage$12.L$4 = null;
                    messages$renderPage$12.L$5 = null;
                    messages$renderPage$12.L$6 = null;
                    messages$renderPage$12.L$7 = null;
                    messages$renderPage$12.I$0 = longValue;
                    messages$renderPage$12.I$1 = longValue2;
                    messages$renderPage$12.I$2 = longValue3;
                    messages$renderPage$12.I$3 = parseColor;
                    messages$renderPage$12.I$4 = z ? 1 : 0;
                    messages$renderPage$12.I$5 = longValue4;
                    messages$renderPage$12.I$6 = longValue5;
                    messages$renderPage$12.I$7 = i;
                    messages$renderPage$12.I$8 = longValue6;
                    messages$renderPage$12.I$9 = i2;
                    messages$renderPage$12.I$10 = z2 ? 1 : 0;
                    messages$renderPage$12.label = 1;
                    messages$renderPage$1 = r2;
                } catch (Exception e4) {
                    e = e4;
                    messages$renderPage$1 = r2;
                    sjh sjhVar2 = uyj.a;
                    g6u g6uVar2 = o400.a;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(messages$renderPage$12.$result, e, null);
                    messages$renderPage$12.L$0 = null;
                    messages$renderPage$12.L$1 = null;
                    messages$renderPage$12.L$2 = null;
                    messages$renderPage$12.L$3 = null;
                    messages$renderPage$12.L$4 = null;
                    messages$renderPage$12.L$5 = null;
                    messages$renderPage$12.L$6 = null;
                    messages$renderPage$12.L$7 = null;
                    messages$renderPage$12.label = 2;
                    if (tje.k0(g6uVar2, anonymousClass2, messages$renderPage$12) != messages$renderPage$1) {
                        return zy11Var;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                messages$renderPage$12 = messages$renderPage$1;
            }
        } catch (Exception e6) {
            e = e6;
            messages$renderPage$12 = messages$renderPage$1;
            messages$renderPage$1 = r2;
        }
        return tje.k0(g6uVar, anonymousClass1, messages$renderPage$12) == messages$renderPage$1 ? messages$renderPage$1 : zy11Var;
    }
}
