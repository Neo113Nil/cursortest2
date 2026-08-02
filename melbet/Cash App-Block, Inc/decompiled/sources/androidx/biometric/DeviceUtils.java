package androidx.biometric;

import android.content.Context;
import android.os.Build;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.FormattingFailedActivityItemKt$FormattingFailedActivityItem$1;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes3.dex */
public abstract class DeviceUtils {
    public static final FormattingFailedActivityItemKt$FormattingFailedActivityItem$1 FormattingFailedActivityItem(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        paymentHistoryActivityItem.getClass();
        return new FormattingFailedActivityItemKt$FormattingFailedActivityItem$1(paymentHistoryActivityItem);
    }

    public static boolean canAssumeStrongBiometrics(Context context) {
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isDisplayingLocation(CashMapViewEvent.MapMovementFinished mapMovementFinished, LocationViewModel locationViewModel) {
        mapMovementFinished.getClass();
        return locationViewModel != null && mapMovementFinished.boundary.contains(locationViewModel.lat, locationViewModel.lng);
    }

    public static LocalParsingResult parseLinkLabel(BlockContent blockContent) {
        int i;
        MarkdownElementType markdownElementType;
        blockContent.getClass();
        MarkdownElementType type2 = blockContent.getType();
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.LBRACKET;
        if (!Intrinsics.areEqual(type2, markdownElementType2)) {
            return null;
        }
        int i2 = blockContent.lineCount;
        ArrayList arrayList = new ArrayList();
        BlockContent advance = blockContent.advance();
        int i3 = -239;
        int i4 = -239;
        while (true) {
            MarkdownElementType type3 = advance.getType();
            i = advance.lineCount;
            markdownElementType = MarkdownTokenTypes.RBRACKET;
            if (Intrinsics.areEqual(type3, markdownElementType) || advance.getType() == null) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new IntRange(i4, i3, 1));
                }
                i4 = i;
            }
            if (Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                i3 = i;
                break;
            }
            advance = advance.advance();
            i3 = i;
        }
        if (!Intrinsics.areEqual(advance.getType(), markdownElementType) || i == i2 + 1) {
            return null;
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i2, i + 1, 1), MarkdownTokenTypes.LINK_LABEL));
        if (i4 != -239) {
            arrayList.add(new IntRange(i4, i3, 1));
        }
        return new LocalParsingResult(advance, (Collection) listOf, arrayList);
    }

    public static LocalParsingResult parseLinkText(BlockContent blockContent) {
        int i;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.RBRACKET;
        blockContent.getClass();
        MarkdownElementType type2 = blockContent.getType();
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.LBRACKET;
        if (!Intrinsics.areEqual(type2, markdownElementType2)) {
            return null;
        }
        int i2 = blockContent.lineCount;
        ArrayList arrayList = new ArrayList();
        BlockContent advance = blockContent.advance();
        int i3 = -239;
        int i4 = -239;
        int i5 = 1;
        while (true) {
            MarkdownElementType type3 = advance.getType();
            i = advance.lineCount;
            if (type3 == null || (Intrinsics.areEqual(advance.getType(), markdownElementType) && i5 - 1 == 0)) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new IntRange(i4, i3, 1));
                }
                i4 = i;
            }
            if (Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                i5++;
            }
            advance = advance.advance();
            i3 = i;
        }
        if (!Intrinsics.areEqual(advance.getType(), markdownElementType)) {
            return null;
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i2, i + 1, 1), MarkdownTokenTypes.LINK_TEXT));
        if (i4 != -239) {
            arrayList.add(new IntRange(i4, i3, 1));
        }
        return new LocalParsingResult(advance, (Collection) listOf, arrayList);
    }
}
