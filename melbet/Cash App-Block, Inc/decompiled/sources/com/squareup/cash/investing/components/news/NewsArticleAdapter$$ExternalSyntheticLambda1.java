package com.squareup.cash.investing.components.news;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.investing.components.categories.InvestingFilterResultRow;
import com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView;
import com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental;
import com.squareup.cash.investing.components.categories.InvestingSubFilterSelection;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt;
import com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView;
import com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class NewsArticleAdapter$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NewsArticleAdapter$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                int i = InvestingFilterResultRow.$r8$clinit;
                break;
            case 2:
                int i2 = InvestingFilterResultRow.$r8$clinit;
                break;
            case 3:
                Context context = (Context) obj;
                context.getClass();
                break;
            case 4:
                int i3 = InvestingFilterSubFiltersView.$r8$clinit;
                break;
            case 5:
                int i4 = InvestingSubFilterIncremental.$r8$clinit;
                break;
            case 6:
                int i5 = InvestingSubFilterIncremental.$r8$clinit;
                break;
            case 7:
                int i6 = InvestingSubFilterIncremental.$r8$clinit;
                break;
            case 8:
                int i7 = InvestingSubFilterSelection.$r8$clinit;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ((DrawScope) obj).getClass();
                break;
            case 12:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                break;
            case 13:
                Context context2 = (Context) obj;
                context2.getClass();
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver);
                break;
            case 15:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 17:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                break;
            case 19:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(InvestingEtfHoldingDetailsKt.lambda$836111566);
                snapshotStateList.add(InvestingEtfHoldingDetailsKt.lambda$1471874053);
                break;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 21:
                ((LinearLayout) obj).getClass();
                break;
            case 22:
                break;
            case 23:
                int i8 = InvestingEarningsGraphDotView.$r8$clinit;
                break;
            case 24:
                int i9 = InvestingEarningsGraphDotView.$r8$clinit;
                break;
            case 25:
                Context context3 = (Context) obj;
                context3.getClass();
                LinearLayout linearLayout = new LinearLayout(context3);
                linearLayout.setOrientation(0);
                break;
            case 26:
                int i10 = InvestingFinancialGraphBarView.$r8$clinit;
                break;
            case 27:
                int i11 = InvestingFinancialGraphBarView.$r8$clinit;
                break;
            case 28:
                int i12 = InvestingFinancialGraphBarView.$r8$clinit;
                break;
            default:
                int i13 = InvestingFinancialGraphBarView.$r8$clinit;
                break;
        }
        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
    }
}
