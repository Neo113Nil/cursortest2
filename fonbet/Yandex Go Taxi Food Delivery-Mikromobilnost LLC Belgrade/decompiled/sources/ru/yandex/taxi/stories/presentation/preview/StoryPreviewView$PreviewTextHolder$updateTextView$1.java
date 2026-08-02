package ru.yandex.taxi.stories.presentation.preview;

import android.widget.TextView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.presentation.preview.StoryPreviewView$PreviewTextHolder$updateTextView$1", f = "StoryPreviewView.kt", l = {309}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryPreviewView$PreviewTextHolder$updateTextView$1 extends SuspendLambda implements wls {
    final /* synthetic */ TextView $fieldView;
    final /* synthetic */ c $formattedTextConverter;
    final /* synthetic */ FormattedText $text;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPreviewView$PreviewTextHolder$updateTextView$1(TextView textView, c cVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.$fieldView = textView;
        this.$formattedTextConverter = cVar;
        this.$text = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryPreviewView$PreviewTextHolder$updateTextView$1(this.$fieldView, this.$formattedTextConverter, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryPreviewView$PreviewTextHolder$updateTextView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                TextView textView2 = this.$fieldView;
                c cVar = this.$formattedTextConverter;
                FormattedText formattedText = this.$text;
                this.L$0 = textView2;
                this.label = 1;
                Object e = c.e(cVar, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                textView = textView2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                textView = (TextView) this.L$0;
                b.b(obj);
            }
            textView.setText((CharSequence) obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to load formatted text for story");
        }
        return zy11.a;
    }
}
