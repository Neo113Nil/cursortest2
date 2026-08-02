package androidx.camera.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlViewLayoutManager;
import androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView;
import com.squareup.scannerview.ScannerView;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;

/* loaded from: classes3.dex */
public final /* synthetic */ class PreviewView$$ExternalSyntheticLambda0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PreviewView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9;
        int i10 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i10) {
            case 0:
                PreviewView previewView = (PreviewView) obj;
                int i11 = PreviewView.$r8$clinit;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.redrawPreview();
                    previewView.attachToControllerIfReady();
                    break;
                }
                break;
            case 1:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                int i12 = playerControlView.settingsWindowMargin;
                PopupWindow popupWindow = playerControlView.settingsWindow;
                int i13 = i4 - i2;
                int i14 = i8 - i6;
                if ((i3 - i != i7 - i5 || i13 != i14) && popupWindow.isShowing()) {
                    playerControlView.updateSettingsWindowSize();
                    popupWindow.update(view, (playerControlView.getWidth() - popupWindow.getWidth()) - i12, (-popupWindow.getHeight()) - i12, -1, -1);
                    break;
                }
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                PlayerControlView playerControlView2 = playerControlViewLayoutManager.playerControlView;
                int width = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = playerControlViewLayoutManager.centerControls;
                int widthWithMargins = PlayerControlViewLayoutManager.getWidthWithMargins(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(widthWithMargins, PlayerControlViewLayoutManager.getWidthWithMargins(playerControlViewLayoutManager.overflowShowButton) + PlayerControlViewLayoutManager.getWidthWithMargins(playerControlViewLayoutManager.timeView));
                ViewGroup viewGroup2 = playerControlViewLayoutManager.bottomBar;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i15 = 2;
                int i16 = (height2 * 2) + paddingBottom;
                int i17 = 1;
                boolean z = width <= max || height3 <= i16;
                if (playerControlViewLayoutManager.isMinimalMode != z) {
                    playerControlViewLayoutManager.isMinimalMode = z;
                    view.post(new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(playerControlViewLayoutManager, i17));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!playerControlViewLayoutManager.isMinimalMode && z2) {
                    view.post(new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(playerControlViewLayoutManager, i15));
                    break;
                }
                break;
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new KnotView$$ExternalSyntheticLambda1(carouselLayoutManager, 3));
                    break;
                }
                break;
            case 4:
                ChatView chatView = (ChatView) obj;
                if (chatView.chatUiUpliftEnabled && (i9 = i4 - i2) > 0) {
                    TranscriptRecyclerView transcriptRecyclerView = chatView.chatView;
                    transcriptRecyclerView.setPadding(transcriptRecyclerView.getPaddingLeft(), transcriptRecyclerView.getPaddingTop(), transcriptRecyclerView.getPaddingRight(), i9);
                    break;
                }
                break;
            case 5:
                ((ScannerView) obj).overlayView.setTopMargin(i4);
                break;
            default:
                int i18 = SpotlightView.$r8$clinit;
                ((SpotlightView) obj).onTargetViewLayoutChange(i, i2, i3, i4);
                break;
        }
    }
}
