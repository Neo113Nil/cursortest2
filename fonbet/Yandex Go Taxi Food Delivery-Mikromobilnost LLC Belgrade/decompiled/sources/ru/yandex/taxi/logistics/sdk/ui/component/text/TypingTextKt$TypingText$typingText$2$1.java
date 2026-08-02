package ru.yandex.taxi.logistics.sdk.ui.component.text;

import androidx.compose.runtime.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.w6f0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw6f0;", "", "Lzy11;", "<anonymous>", "(Lw6f0;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.text.TypingTextKt$TypingText$typingText$2$1", f = "TypingText.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TypingTextKt$TypingText$typingText$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $letterDelay;
    final /* synthetic */ String $text;
    char C$0;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingTextKt$TypingText$typingText$2$1(String str, long j, Continuation continuation) {
        super(2, continuation);
        this.$text = str;
        this.$letterDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TypingTextKt$TypingText$typingText$2$1 typingTextKt$TypingText$typingText$2$1 = new TypingTextKt$TypingText$typingText$2$1(this.$text, this.$letterDelay, continuation);
        typingTextKt$TypingText$typingText$2$1.L$0 = obj;
        return typingTextKt$TypingText$typingText$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TypingTextKt$TypingText$typingText$2$1) create((w6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005f -> B:5:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int length;
        int i;
        StringBuilder sb;
        oz40 oz40Var = (w6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.$text;
            str = str2;
            length = str2.length();
            i = 0;
            sb = sb2;
            if (i < length) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.I$1;
            i = this.I$0;
            str = (String) this.L$2;
            sb = (StringBuilder) this.L$1;
            b.b(obj);
            i++;
            if (i < length) {
                char charAt = str.charAt(i);
                sb.append(charAt);
                oz40Var = (g) oz40Var;
                oz40Var.setValue(sb.toString());
                long j = this.$letterDelay;
                this.L$0 = oz40Var;
                this.L$1 = sb;
                this.L$2 = str;
                this.I$0 = i;
                this.I$1 = length;
                this.C$0 = charAt;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i++;
                if (i < length) {
                    return zy11.a;
                }
            }
        }
    }
}
