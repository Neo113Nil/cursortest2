package ru.yandex.taxi.widget;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import defpackage.g16;
import defpackage.kbs;
import defpackage.kdc;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofv;
import defpackage.s8o;
import defpackage.tbv;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.CustomImageSpan;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widget.FormattedTextConverter$appendImage$1", f = "FormattedTextConverter.kt", l = {SmtpServerPrefsFragment.DEFAULT_SMTP_PORT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FormattedTextConverter$appendImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ SpannableStringBuilder $builder;
    final /* synthetic */ int $height;
    final /* synthetic */ ru.yandex.taxi.common_models.net.a $image;
    final /* synthetic */ tbv $imageModel;
    final /* synthetic */ CustomImageSpan $imageSpan;
    final /* synthetic */ boolean $safeLoad;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormattedTextConverter$appendImage$1(c cVar, tbv tbvVar, int i, int i2, CustomImageSpan customImageSpan, ru.yandex.taxi.common_models.net.a aVar, boolean z, SpannableStringBuilder spannableStringBuilder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$imageModel = tbvVar;
        this.$width = i;
        this.$height = i2;
        this.$imageSpan = customImageSpan;
        this.$image = aVar;
        this.$safeLoad = z;
        this.$builder = spannableStringBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormattedTextConverter$appendImage$1(this.this$0, this.$imageModel, this.$width, this.$height, this.$imageSpan, this.$image, this.$safeLoad, this.$builder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormattedTextConverter$appendImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 e = this.this$0.a.b().i(this.$imageModel).g(this.$width, this.$height).e(ofv.a);
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            int i2 = this.$width;
            if (i2 <= 0) {
                i2 = bitmap.getWidth();
            }
            int i3 = this.$height;
            if (i3 <= 0) {
                i3 = bitmap.getHeight();
            }
            CustomImageSpan customImageSpan = this.$imageSpan;
            c cVar = this.this$0;
            kgx[] kgxVarArr = c.g;
            Resources resources = cVar.g().getResources();
            String c = this.$image.getC();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            if (i2 > 0 && i3 > 0) {
                bitmapDrawable.setBounds(0, 0, i2, i3);
            } else if (i2 > 0) {
                bitmapDrawable.setBounds(0, 0, i2, (bitmap.getHeight() * i2) / bitmap.getWidth());
            } else if (i3 > 0) {
                bitmapDrawable.setBounds(0, 0, (bitmap.getWidth() * i3) / bitmap.getHeight(), i3);
            } else {
                bitmapDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            }
            kdc g = ((ufu) cVar.d).g(c);
            if (g != null) {
                bitmapDrawable.setTint(s8o.m(g, cVar.g()));
            }
            customImageSpan.setDrawable(bitmapDrawable);
        } else {
            if (!this.$safeLoad) {
                kbs.g("Image load failed with unknown error");
                return null;
            }
            this.$builder.removeSpan(this.$imageSpan);
        }
        return zy11.a;
    }
}
