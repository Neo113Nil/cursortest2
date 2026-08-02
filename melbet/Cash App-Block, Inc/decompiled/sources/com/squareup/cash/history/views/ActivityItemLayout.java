package com.squareup.cash.history.views;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.treehouse.ButtonBinding;
import com.squareup.cash.arcade.treehouse.ChildrenList;
import com.squareup.cash.arcade.treehouse.SpinnerBinding;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.wire.ByteArrayProtoReader32;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;

/* loaded from: classes6.dex */
public final class ActivityItemLayout extends ContourLayout implements Widget {
    public final ChildrenList action;
    public final ChildrenList avatar;
    public final int buttonMarginRight;
    public final int marginBottom;
    public final int marginLeft;
    public final int marginRight;
    public final int marginTop;
    public Modifier modifier;
    public final ChildrenList subtitle;
    public final ChildrenList title;
    public final ChildrenList unread;
    public final ActivityItemLayout value;

    public ActivityItemLayout(Context context) {
        super(context);
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.marginLeft = context.getResources().getDimensionPixelOffset(R.dimen.activity_item_padding_sides_tab);
        this.marginRight = context.getResources().getDimensionPixelOffset(R.dimen.activity_item_padding_sides_tab);
        this.buttonMarginRight = context.getResources().getDimensionPixelOffset(R.dimen.activity_item_button_padding_sides_tab);
        this.marginTop = getDip(20);
        this.marginBottom = getDip(24);
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.unread = new ChildrenList(this, "unread");
        this.avatar = new ChildrenList(this, "avatar");
        this.title = new ChildrenList(this, "title");
        this.subtitle = new ChildrenList(this, "subtitle");
        this.action = new ChildrenList(this, "action");
        contourHeightOf(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 0));
        setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(colorPalette.background), 2));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        final int i4;
        final int i5;
        Iterator it = this.unread.iterator();
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$1 = (FilteringSequence$iterator$1) it;
            final int i6 = 0;
            if (!filteringSequence$iterator$1.hasNext()) {
                break;
            }
            final View view = (View) filteringSequence$iterator$1.next();
            ContourLayout.layoutBy$default(this, view, ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda2
                public final /* synthetic */ ActivityItemLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i7 = i6;
                    View view2 = view;
                    ActivityItemLayout activityItemLayout = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i7) {
                        case 0:
                            return new XInt(((activityItemLayout.m3820widthTENr5nQ(view2) + activityItemLayout.marginLeft) / 2) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view2) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                        default:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view2) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                    }
                }
            }), ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(8)));
        }
        Iterator it2 = this.avatar.iterator();
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$12 = (FilteringSequence$iterator$1) it2;
            i3 = 3;
            i4 = 2;
            if (!filteringSequence$iterator$12.hasNext()) {
                break;
            }
            View view2 = (View) filteringSequence$iterator$12.next();
            ContourLayout.layoutBy$default(this, view2, ContourLayout.leftTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, i4)), ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(9)));
            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                view2.addOnLayoutChangeListener(new SplashScreen$Impl$setOnExitAnimationListener$2(i3, this, view2));
            } else {
                Rect rect = new Rect();
                view2.getHitRect(rect);
                rect.set(0, 0, rect.right, rect.bottom + rect.top);
                setTouchDelegate(new TouchDelegate(rect, view2));
            }
        }
        Iterator it3 = this.subtitle.iterator();
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$13 = (FilteringSequence$iterator$1) it3;
            i5 = 1;
            if (!filteringSequence$iterator$13.hasNext()) {
                break;
            }
            final View view3 = (View) filteringSequence$iterator$13.next();
            ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, i3));
            leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda2
                public final /* synthetic */ ActivityItemLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i7 = i5;
                    View view22 = view3;
                    ActivityItemLayout activityItemLayout = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i7) {
                        case 0:
                            return new XInt(((activityItemLayout.m3820widthTENr5nQ(view22) + activityItemLayout.marginLeft) / 2) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view22) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                        default:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view22) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, view3, leftTo, ContourLayout.bottomTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 4)));
        }
        Iterator it4 = this.title.iterator();
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$14 = (FilteringSequence$iterator$1) it4;
            if (!filteringSequence$iterator$14.hasNext()) {
                break;
            }
            final View view4 = (View) filteringSequence$iterator$14.next();
            ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 5));
            leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda2
                public final /* synthetic */ ActivityItemLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i7 = i4;
                    View view22 = view4;
                    ActivityItemLayout activityItemLayout = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i7) {
                        case 0:
                            return new XInt(((activityItemLayout.m3820widthTENr5nQ(view22) + activityItemLayout.marginLeft) / 2) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view22) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                        default:
                            layoutSpec.getClass();
                            return new XInt(Math.min(activityItemLayout.m3566titleSubtitleRightTENr5nQ(layoutSpec), activityItemLayout.m3817preferredWidthTENr5nQ(view22) + activityItemLayout.m3565titleSubtitleLeftTENr5nQ()));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, view4, leftTo2, ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 6)));
        }
        Iterator it5 = this.action.iterator();
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$15 = (FilteringSequence$iterator$1) it5;
            if (!filteringSequence$iterator$15.hasNext()) {
                super.onMeasure(i, i2);
                return;
            }
            View view5 = (View) filteringSequence$iterator$15.next();
            if ((view5 instanceof ProgressBar) || (view5 instanceof ActivityRowChevron) || (view5 instanceof SpinnerBinding)) {
                ContourLayout.layoutBy$default(this, view5, ContourLayout.rightTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 12)), ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(0)));
            } else if ((view5 instanceof Button) || (view5 instanceof ButtonBinding)) {
                ContourLayout.layoutBy$default(this, view5, ContourLayout.rightTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 13)), ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(10)));
            } else if (view5 instanceof FigmaTextView) {
                ContourLayout.layoutBy$default(this, view5, ContourLayout.rightTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 14)), ContourLayout.topTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 15)));
            } else {
                ContourLayout.layoutBy$default(this, view5, ContourLayout.rightTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, 16)), ContourLayout.topTo(new ActivityItemLayout$$ExternalSyntheticLambda1(this, i5)));
            }
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }

    /* renamed from: titleSubtitleLeft-TENr5nQ, reason: not valid java name */
    public final int m3565titleSubtitleLeftTENr5nQ() {
        TransformingSequence map = SequencesKt___SequencesKt.map(this.avatar, new ActivityItemLayout$$ExternalSyntheticLambda1(this, 9));
        Iterator it = map.sequence.iterator();
        int i = this.marginLeft;
        while (it.hasNext()) {
            i = Math.max(i, ((XInt) map.transformer.invoke(it.next())).value);
        }
        return i;
    }

    /* renamed from: titleSubtitleRight-TENr5nQ, reason: not valid java name */
    public final int m3566titleSubtitleRightTENr5nQ(ContourLayout.LayoutSpec layoutSpec) {
        TransformingSequence map = SequencesKt___SequencesKt.map(this.action, new ActivityItemLayout$$ExternalSyntheticLambda1(this, 10));
        int m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0() - this.marginRight;
        Iterator it = map.sequence.iterator();
        while (it.hasNext()) {
            m4374rightblrYgr0 = Math.min(m4374rightblrYgr0, ((XInt) map.transformer.invoke(it.next())).value);
        }
        return m4374rightblrYgr0;
    }
}
