package androidx.compose.material3;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView;
import com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda10(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                return Integer.valueOf(i2);
            case 1:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - i2);
            case 2:
                ((Integer) obj).intValue();
                return Integer.valueOf(i2);
            case 3:
                ((Integer) obj).intValue();
                return Integer.valueOf(-i2);
            case 4:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                ContentTransform contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(new TweenSpec(367, 117, FilterBarKt.EnterPositionEasing), new DatePickerKt$$ExternalSyntheticLambda10(i2, 3)).plus(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, FilterBarKt.EnterOpacityEasing), 2)), EnterExitTransitionKt.slideOutVertically(new TweenSpec(367, 117, FilterBarKt.ExitPositionEasing), new DatePickerKt$$ExternalSyntheticLambda10(i2, 2)).plus(EnterExitTransitionKt.fadeOut$default(new TweenSpec(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 117, FilterBarKt.ExitOpacityEasing), 2)));
                contentTransform.sizeTransform = AnimatedContentKt.SizeTransform$default(2, null);
                return contentTransform;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                CollectionItemInfo collectionItemInfo = new CollectionItemInfo(0, 1, i2);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.CollectionItemInfo;
                KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[25];
                semanticsPropertyReceiver.set(semanticsPropertyKey, collectionItemInfo);
                return Unit.INSTANCE;
            case 6:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(i2));
            case 7:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(i2));
            case 8:
                return Integer.valueOf(i2);
            case 9:
                ((Density) obj).getClass();
                return new IntOffset((-r7.mo230roundToPx0680j_4(i2)) & BodyPartID.bodyIdMax);
            case 10:
                ((Density) obj).getClass();
                return new IntOffset((-r7.mo230roundToPx0680j_4(i2)) & BodyPartID.bodyIdMax);
            case 11:
                Context context = (Context) obj;
                context.getClass();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setMinimumHeight(i2);
                return linearLayout;
            case 12:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + i2);
            case 13:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return new XInt(layoutSpec2.getParent().m4374rightblrYgr0() - i2);
            case 14:
                ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                int i3 = InvestingEarningsGraphDotView.$r8$clinit;
                layoutSpec3.getClass();
                return new YInt(layoutSpec3.getParent().m4372bottomh0YXg9w() - i2);
            case 15:
                int i4 = InvestingFinancialGraphBarView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(i2);
            case 16:
                int i5 = InvestingFinancialGraphBarView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(i2);
            case 17:
                int i6 = InvestingFinancialGraphBarView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(i2);
            case 18:
                int i7 = InvestingFinancialGraphBarView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(i2);
            case 19:
                ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                int i8 = InvestingFinancialGraphBarView.$r8$clinit;
                layoutSpec4.getClass();
                return new YInt(layoutSpec4.getParent().m4372bottomh0YXg9w() - i2);
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 21:
                return Integer.valueOf((-((Integer) obj).intValue()) * i2);
            case 22:
                ((Integer) obj).intValue();
                return Integer.valueOf(i2);
            case 23:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Collection doesn't contain element at index ", i2, '.'));
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Sequence doesn't contain element at index ", i2, '.'));
        }
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda10(InvestingFinancialGraphBarView investingFinancialGraphBarView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }
}
