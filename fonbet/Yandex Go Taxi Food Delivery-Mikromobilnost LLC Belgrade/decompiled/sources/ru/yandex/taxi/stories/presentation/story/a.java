package ru.yandex.taxi.stories.presentation.story;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.drc;
import defpackage.erc;
import defpackage.evu0;
import defpackage.kou0;
import defpackage.mtc;
import defpackage.nsz;
import defpackage.ntc;
import defpackage.otc;
import defpackage.ptc;
import defpackage.qeb1;
import defpackage.tje;
import defpackage.uab1;
import defpackage.vby;
import defpackage.xby;
import java.util.Arrays;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.stories.presentation.story.StoryContentView;

/* loaded from: classes6.dex */
public final class a implements kou0 {
    public final /* synthetic */ StoryContentView b;

    public a(StoryContentView storyContentView) {
        this.b = storyContentView;
    }

    @Override // defpackage.kou0
    public final void a(Bitmap bitmap) {
        int mediaContentAvailableHeight;
        ImageView imageView;
        ImageView imageView2;
        int mediaContentAvailableHeight2;
        ImageView imageView3;
        ImageView imageView4;
        StoryContentView storyContentView = this.b;
        if (bitmap == null) {
            imageView4 = storyContentView.imageView;
            imageView4.setImageDrawable(null);
            return;
        }
        float height = bitmap.getHeight() * 0.5f;
        mediaContentAvailableHeight = storyContentView.mediaContentAvailableHeight();
        if (height <= mediaContentAvailableHeight) {
            imageView = storyContentView.imageView;
            imageView.setVisibility(0);
            imageView2 = storyContentView.imageView;
            imageView2.setImageBitmap(bitmap);
            return;
        }
        vby vbyVar = xby.d;
        IllegalStateException illegalStateException = new IllegalStateException("Not enough space");
        Integer valueOf = Integer.valueOf(bitmap.getHeight());
        mediaContentAvailableHeight2 = storyContentView.mediaContentAvailableHeight();
        vbyVar.k(illegalStateException, String.format("Not enough space to show main_view image. Original %d, left %d", Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(mediaContentAvailableHeight2)}, 2)));
        imageView3 = storyContentView.imageView;
        imageView3.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // defpackage.kou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(CharSequence charSequence, boolean z, boolean z2) {
        ListHeaderComponent listHeaderComponent;
        ptc ptcVar;
        otc otcVar;
        ListHeaderComponent listHeaderComponent2;
        ListHeaderComponent listHeaderComponent3;
        ListHeaderComponent listHeaderComponent4;
        ListHeaderComponent listHeaderComponent5;
        ListHeaderComponent listHeaderComponent6;
        ListHeaderComponent listHeaderComponent7;
        StoryContentView storyContentView = this.b;
        if (charSequence == null || evu0.J(charSequence)) {
            listHeaderComponent = storyContentView.titleView;
            listHeaderComponent.setVisibility(8);
            return;
        }
        ptcVar = storyContentView.communicationsFontPropertiesProvider;
        if (ptcVar != null) {
            erc ercVar = ((drc) ptcVar).a;
            if (erc.a(ercVar)) {
                otcVar = ercVar.c.c(ercVar.a);
                if (otcVar != null) {
                    ntc ntcVar = otcVar.a;
                    if (z2) {
                        ntcVar = new ntc(ntcVar.a, tje.b0(storyContentView.getContext(), 140.0f), tje.b0(storyContentView.getContext(), 18.0f), 1.0f, 1, ntcVar.f, 4, ntcVar.h);
                    }
                    listHeaderComponent7 = storyContentView.titleView;
                    uab1.c(listHeaderComponent7, ntcVar, charSequence, z);
                }
                if (z2) {
                    listHeaderComponent2 = storyContentView.titleView;
                    listHeaderComponent2.setTitle(charSequence);
                } else {
                    SpannableString spannableString = new SpannableString(charSequence);
                    spannableString.setSpan(new StoryContentView.DescentSpan(tje.u(20, storyContentView.getContext())), 0, charSequence.length(), 33);
                    listHeaderComponent6 = storyContentView.titleView;
                    listHeaderComponent6.setTitle(spannableString);
                }
                listHeaderComponent3 = storyContentView.titleView;
                listHeaderComponent3.setVisibility(0);
                if (qeb1.d(charSequence)) {
                    listHeaderComponent4 = storyContentView.titleView;
                    listHeaderComponent4.setTitleMovementMethod(null);
                    return;
                } else {
                    listHeaderComponent5 = storyContentView.titleView;
                    listHeaderComponent5.setTitleMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
            }
        }
        otcVar = null;
        if (otcVar != null) {
        }
        if (z2) {
        }
        listHeaderComponent3 = storyContentView.titleView;
        listHeaderComponent3.setVisibility(0);
        if (qeb1.d(charSequence)) {
        }
    }

    @Override // defpackage.kou0
    public final void c(String str, boolean z) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        StoryContentView storyContentView = this.b;
        lottieAnimationView = storyContentView.animationView;
        lottieAnimationView.setRepeatCount(z ? -1 : 0);
        lottieAnimationView2 = storyContentView.animationView;
        lottieAnimationView2.setAnimationFromUrl(str);
    }

    @Override // defpackage.kou0
    public final void d(boolean z) {
        LottieAnimationView lottieAnimationView;
        ImageView imageView;
        LottieAnimationView lottieAnimationView2;
        StoryContentView storyContentView = this.b;
        lottieAnimationView = storyContentView.animationView;
        lottieAnimationView.clearAnimation();
        if (z) {
            imageView = storyContentView.imageView;
            imageView.setVisibility(4);
            lottieAnimationView2 = storyContentView.animationView;
            lottieAnimationView2.setVisibility(4);
        }
    }

    @Override // defpackage.kou0
    public final void e(CharSequence charSequence) {
        ListTextComponent listTextComponent;
        ptc ptcVar;
        ListTextComponent listTextComponent2;
        ListTextComponent listTextComponent3;
        ListTextComponent listTextComponent4;
        StoryContentView storyContentView = this.b;
        if (charSequence == null || evu0.J(charSequence)) {
            listTextComponent = storyContentView.descriptionView;
            listTextComponent.setVisibility(8);
            return;
        }
        ptcVar = storyContentView.communicationsFontPropertiesProvider;
        mtc mtcVar = null;
        if (ptcVar != null) {
            erc ercVar = ((drc) ptcVar).a;
            otc c = erc.a(ercVar) ? ercVar.c.c(ercVar.a) : null;
            if (c != null) {
                mtcVar = c.b;
            }
        }
        if (mtcVar != null) {
            listTextComponent4 = storyContentView.descriptionView;
            listTextComponent4.setTextAlignment(1);
        }
        listTextComponent2 = storyContentView.descriptionView;
        listTextComponent2.setVisibility(0);
        listTextComponent3 = storyContentView.descriptionView;
        listTextComponent3.setHtmlText(charSequence);
    }

    @Override // defpackage.kou0
    public final void f(nsz nszVar) {
        int mediaContentAvailableHeight;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        boolean z;
        LottieAnimationView lottieAnimationView3;
        int mediaContentAvailableHeight2;
        LottieAnimationView lottieAnimationView4;
        float height = nszVar.k.height() * 0.5f;
        StoryContentView storyContentView = this.b;
        mediaContentAvailableHeight = storyContentView.mediaContentAvailableHeight();
        if (height > mediaContentAvailableHeight) {
            vby vbyVar = xby.d;
            IllegalStateException illegalStateException = new IllegalStateException("Not enough space");
            Integer valueOf = Integer.valueOf(nszVar.k.height());
            mediaContentAvailableHeight2 = storyContentView.mediaContentAvailableHeight();
            vbyVar.k(illegalStateException, String.format("Not enough space to show main_view animation. Original %d, left %d", Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(mediaContentAvailableHeight2)}, 2)));
            lottieAnimationView4 = storyContentView.animationView;
            lottieAnimationView4.setVisibility(4);
            return;
        }
        lottieAnimationView = storyContentView.animationView;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView2 = storyContentView.animationView;
        lottieAnimationView2.setComposition(nszVar);
        z = storyContentView.resumed;
        if (z) {
            lottieAnimationView3 = storyContentView.animationView;
            lottieAnimationView3.playAnimation();
        }
    }
}
