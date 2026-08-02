package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.FilteringSequence$iterator$1;

/* loaded from: classes5.dex */
public final class NavBarBinding extends ContourLayout implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public final ChildrenList endContainer;
    public Modifier modifier;
    public final ChildrenList startContainer;
    public final int toolbarSize;
    public final NavBarBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarBinding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.endContainer = new ChildrenList(this, "endContainer");
        this.startContainer = new ChildrenList(this, "startContainer");
        this.toolbarSize = PlatformKt.getDimensionPixelSize$default(context);
        contourHeightOf(new BadgeQueries$$ExternalSyntheticLambda5(this, 2));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    public final void layoutChildren$1() {
        final int i;
        Iterator it = this.startContainer.iterator();
        final View view = null;
        final View view2 = null;
        while (true) {
            FilteringSequence$iterator$1 filteringSequence$iterator$1 = (FilteringSequence$iterator$1) it;
            i = 1;
            if (!filteringSequence$iterator$1.hasNext()) {
                break;
            }
            View view3 = (View) filteringSequence$iterator$1.next();
            final int i2 = 0;
            ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1() { // from class: com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    NavBarBinding navBarBinding = this;
                    View view4 = view2;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i3) {
                        case 0:
                            int i4 = NavBarBinding.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(view4 != null ? navBarBinding.m3818rightTENr5nQ(view4) : layoutSpec.getParent().padding().left);
                        default:
                            int i5 = NavBarBinding.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(view4 != null ? navBarBinding.m3816leftTENr5nQ(view4) : layoutSpec.getParent().m4374rightblrYgr0());
                    }
                }
            });
            ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new NavBarBinding$$ExternalSyntheticLambda2(0));
            centerVerticallyTo.heightOf(1, new NavBarBinding$$ExternalSyntheticLambda2(26));
            ContourLayout.layoutBy$default(this, view3, leftTo, centerVerticallyTo);
            view2 = view3;
        }
        Iterator it2 = this.endContainer.reversed.iterator();
        while (true) {
            ChildrenList$reverseIterator$1 childrenList$reverseIterator$1 = (ChildrenList$reverseIterator$1) it2;
            if (!childrenList$reverseIterator$1.hasNext()) {
                return;
            }
            View view4 = (View) childrenList$reverseIterator$1.next();
            ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new Function1() { // from class: com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i;
                    NavBarBinding navBarBinding = this;
                    View view42 = view;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i3) {
                        case 0:
                            int i4 = NavBarBinding.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(view42 != null ? navBarBinding.m3818rightTENr5nQ(view42) : layoutSpec.getParent().padding().left);
                        default:
                            int i5 = NavBarBinding.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(view42 != null ? navBarBinding.m3816leftTENr5nQ(view42) : layoutSpec.getParent().m4374rightblrYgr0());
                    }
                }
            });
            ByteArrayProtoReader32 centerVerticallyTo2 = ContourLayout.centerVerticallyTo(new NavBarBinding$$ExternalSyntheticLambda2(27));
            centerVerticallyTo2.heightOf(1, new NavBarBinding$$ExternalSyntheticLambda2(28));
            ContourLayout.layoutBy$default(this, view4, rightTo, centerVerticallyTo2);
            view = view4;
        }
    }

    @Override // com.squareup.contour.ContourLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        layoutChildren$1();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        layoutChildren$1();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof ImageButton) {
            ImageButton imageButton = (ImageButton) view;
            RippleDrawable createBorderlessRippleDrawable = RipplesKt.createBorderlessRippleDrawable(view);
            createBorderlessRippleDrawable.setRadius(Views.dip((View) this, 20));
            imageButton.setBackground(createBorderlessRippleDrawable);
            imageButton.setScaleType(ImageView.ScaleType.CENTER);
            imageButton.setAdjustViewBounds(true);
            imageButton.setImageTintList(ColorStateList.valueOf(this.colorPalette.icon));
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
