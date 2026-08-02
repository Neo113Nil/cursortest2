package ru.yandex.taxi.widget;

import android.text.SpannableStringBuilder;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/text/SpannableStringBuilder;", "<anonymous>", "(Ltse;)Landroid/text/SpannableStringBuilder;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widget.FormattedTextConverter$awaitConvert$2", f = "FormattedTextConverter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class FormattedTextConverter$awaitConvert$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $allowDefaultFont;
    final /* synthetic */ boolean $ignoreConvertForDarkMode;
    final /* synthetic */ boolean $safeImageLoad;
    final /* synthetic */ Map<String, String> $templates;
    final /* synthetic */ FormattedText $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormattedTextConverter$awaitConvert$2(c cVar, FormattedText formattedText, boolean z, boolean z2, boolean z3, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$text = formattedText;
        this.$safeImageLoad = z;
        this.$ignoreConvertForDarkMode = z2;
        this.$allowDefaultFont = z3;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormattedTextConverter$awaitConvert$2 formattedTextConverter$awaitConvert$2 = new FormattedTextConverter$awaitConvert$2(this.this$0, this.$text, this.$safeImageLoad, this.$ignoreConvertForDarkMode, this.$allowDefaultFont, this.$templates, continuation);
        formattedTextConverter$awaitConvert$2.L$0 = obj;
        return formattedTextConverter$awaitConvert$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormattedTextConverter$awaitConvert$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List list = this.$text.a;
        boolean z = this.$safeImageLoad;
        boolean z2 = !this.$ignoreConvertForDarkMode;
        boolean z3 = this.$allowDefaultFont;
        Map<String, String> map = this.$templates;
        kgx[] kgxVarArr = c.g;
        cVar.a(spannableStringBuilder, tseVar, list, z, z2, z3, map);
        return spannableStringBuilder;
    }
}
