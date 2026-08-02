package com.braze.ui.support;

import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.braze.ui.inappmessage.views.InAppMessageSlideupView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.clustering.ClusteringMarkerProperties;
import com.mikepenz.markdown.compose.ComposeLocalKt$$ExternalSyntheticLambda14;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotator;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotatorConfig;
import com.mikepenz.markdown.model.DefaultMarkdownExtendedSpans;
import com.mikepenz.markdown.model.DefaultMarkdownInlineContent;
import com.mikepenz.markdown.model.ImageWidth;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.ThreadPoolDispatcherKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ViewUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String removeViewFromParent$lambda$0;
        String webViewContent$lambda$0;
        String finishWebViewDisplay$lambda$0;
        String onCreateWindow$lambda$1;
        String onCreateWindow$lambda$2;
        String clipCanvasToPath$lambda$0;
        String clipCanvasToPath$lambda$1;
        String str;
        String largerCloseButtonClickArea$lambda$0;
        String resetMessageMargins$lambda$0$0;
        String applyWindowInsets$lambda$0;
        String removeViewFromParent$lambda$2;
        String focusableInTouchModeAndRequestFocus$lambda$0;
        String isCurrentOrientationValid$lambda$0;
        String isCurrentOrientationValid$lambda$1;
        String webViewSettings$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                removeViewFromParent$lambda$0 = ViewUtils.removeViewFromParent$lambda$0();
                return removeViewFromParent$lambda$0;
            case 1:
                webViewContent$lambda$0 = InAppMessageHtmlBaseView.setWebViewContent$lambda$0();
                return webViewContent$lambda$0;
            case 2:
                finishWebViewDisplay$lambda$0 = InAppMessageHtmlBaseView.finishWebViewDisplay$lambda$0();
                return finishWebViewDisplay$lambda$0;
            case 3:
                onCreateWindow$lambda$1 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$1();
                return onCreateWindow$lambda$1;
            case 4:
                onCreateWindow$lambda$2 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$2();
                return onCreateWindow$lambda$2;
            case 5:
                clipCanvasToPath$lambda$0 = InAppMessageImageView.clipCanvasToPath$lambda$0();
                return clipCanvasToPath$lambda$0;
            case 6:
                clipCanvasToPath$lambda$1 = InAppMessageImageView.clipCanvasToPath$lambda$1();
                return clipCanvasToPath$lambda$1;
            case 7:
                str = InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$0();
                return str;
            case 8:
                largerCloseButtonClickArea$lambda$0 = InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$0();
                return largerCloseButtonClickArea$lambda$0;
            case 9:
                resetMessageMargins$lambda$0$0 = InAppMessageModalView.resetMessageMargins$lambda$0$0();
                return resetMessageMargins$lambda$0$0;
            case 10:
                applyWindowInsets$lambda$0 = InAppMessageSlideupView.applyWindowInsets$lambda$0();
                return applyWindowInsets$lambda$0;
            case 11:
                removeViewFromParent$lambda$2 = ViewUtils.removeViewFromParent$lambda$2();
                return removeViewFromParent$lambda$2;
            case 12:
                focusableInTouchModeAndRequestFocus$lambda$0 = ViewUtils.setFocusableInTouchModeAndRequestFocus$lambda$0();
                return focusableInTouchModeAndRequestFocus$lambda$0;
            case 13:
                isCurrentOrientationValid$lambda$0 = ViewUtils.isCurrentOrientationValid$lambda$0();
                return isCurrentOrientationValid$lambda$0;
            case 14:
                isCurrentOrientationValid$lambda$1 = ViewUtils.isCurrentOrientationValid$lambda$1();
                return isCurrentOrientationValid$lambda$1;
            case 15:
                webViewSettings$lambda$0 = WebViewUtilsKt.setWebViewSettings$lambda$0();
                return webViewSettings$lambda$0;
            case 16:
                return new CameraPositionState(new CameraPosition(new LatLng(0.0d, 0.0d), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
            case 17:
                return new GoogleMapOptions();
            case 18:
                return new ClusteringMarkerProperties();
            case 19:
                return new ComposeLocalKt$$ExternalSyntheticLambda14(0);
            case 20:
                throw new IllegalStateException("No local MarkdownDimens");
            case 21:
                throw new IllegalStateException("No local ImageTransformer");
            case 22:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return new DefaultMarkdownInlineContent(emptyMap);
            case 23:
                return ImageWidth.IMAGE_WIDTH;
            case 24:
                return new DefaultMarkdownAnnotator(new DefaultMarkdownAnnotatorConfig());
            case 25:
                return new DefaultMarkdownExtendedSpans(null);
            case 26:
                return ThreadPoolDispatcherKt.markdownComponents$default(4194303);
            case 27:
                throw new IllegalStateException("No local MarkdownAnimations");
            case 28:
                return new ComposeLocalKt$$ExternalSyntheticLambda14(1);
            default:
                throw new IllegalStateException("CompositionLocal ReferenceLinkHandler not present");
        }
    }
}
