package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.ijn;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.tls;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.ProcessingWidget;
import ru.rt.ebs.cryptosdk.presentation.customView.SuccessfulVerificationWidget;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements tls {
    public static final a b = new a();

    public a() {
        super(1, 0, ijn.class, "bind", "bind(Landroid/view/View;)Lru/rt/ebs/cryptosdk/databinding/EbsFragPhotoRecordingBinding;");
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View O;
        View view = (View) obj;
        int i = sch0.ebs_frag_photo_recording_btn;
        CustomizableButton customizableButton = (CustomizableButton) cma1.O(i, view);
        if (customizableButton != null) {
            i = sch0.ebs_frag_photo_recording_content_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, view);
            if (constraintLayout != null) {
                i = sch0.ebs_frag_photo_recording_header;
                CustomizableHeader customizableHeader = (CustomizableHeader) cma1.O(i, view);
                if (customizableHeader != null) {
                    i = sch0.ebs_frag_photo_recording_iv;
                    ImageView imageView = (ImageView) cma1.O(i, view);
                    if (imageView != null) {
                        i = sch0.ebs_frag_photo_recording_preview;
                        PreviewView previewView = (PreviewView) cma1.O(i, view);
                        if (previewView != null) {
                            i = sch0.ebs_frag_photo_recording_preview_container;
                            FrameLayout frameLayout = (FrameLayout) cma1.O(i, view);
                            if (frameLayout != null) {
                                i = sch0.ebs_frag_photo_recording_processing_widget;
                                ProcessingWidget processingWidget = (ProcessingWidget) cma1.O(i, view);
                                if (processingWidget != null) {
                                    i = sch0.ebs_frag_photo_recording_successful_verification_widget;
                                    SuccessfulVerificationWidget successfulVerificationWidget = (SuccessfulVerificationWidget) cma1.O(i, view);
                                    if (successfulVerificationWidget != null) {
                                        i = sch0.ebs_frag_photo_recording_web_view;
                                        WebView webView = (WebView) cma1.O(i, view);
                                        if (webView != null && (O = cma1.O((i = sch0.ebs_frag_video_recording_header_background_view), view)) != null) {
                                            return new ijn((FrameLayout) view, customizableButton, constraintLayout, customizableHeader, imageView, previewView, frameLayout, processingWidget, successfulVerificationWidget, webView, O);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
