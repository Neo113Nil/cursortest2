package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.view.QrReaderErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class r461 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final QrReaderErrorView c;
    public final OperationProgressView d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final AppCompatImageView g;
    public final FrameLayout h;
    public final AppCompatImageView i;
    public final AppCompatImageView j;
    public final FrameLayout k;
    public final AppCompatTextView l;
    public final AppCompatTextView m;
    public final FrameLayout n;
    public final ToolbarView o;

    public r461(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, QrReaderErrorView qrReaderErrorView, OperationProgressView operationProgressView, FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView2, FrameLayout frameLayout3, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, FrameLayout frameLayout4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, FrameLayout frameLayout5, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = qrReaderErrorView;
        this.d = operationProgressView;
        this.e = frameLayout;
        this.f = frameLayout2;
        this.g = appCompatImageView2;
        this.h = frameLayout3;
        this.i = appCompatImageView3;
        this.j = appCompatImageView4;
        this.k = frameLayout4;
        this.l = appCompatTextView;
        this.m = appCompatTextView2;
        this.n = frameLayout5;
        this.o = toolbarView;
    }

    public static r461 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(ynh0.ybsdk_qr_code_reader, viewGroup, false);
        int i = obh0.barcodeFrame;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = obh0.errorView;
            QrReaderErrorView qrReaderErrorView = (QrReaderErrorView) cma1.O(i, inflate);
            if (qrReaderErrorView != null) {
                i = obh0.progress;
                OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                if (operationProgressView != null) {
                    i = obh0.progressContainer;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                    if (frameLayout != null) {
                        i = obh0.qrReaderFlashlightButton;
                        FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout2 != null) {
                            i = obh0.qrReaderFlashlightButtonIcon;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                            if (appCompatImageView2 != null) {
                                i = obh0.qrReaderInfoButton;
                                FrameLayout frameLayout3 = (FrameLayout) cma1.O(i, inflate);
                                if (frameLayout3 != null) {
                                    i = obh0.qrReaderInfoButtonIcon;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, inflate);
                                    if (appCompatImageView3 != null) {
                                        i = obh0.qrReaderLogo;
                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i, inflate);
                                        if (appCompatImageView4 != null) {
                                            i = obh0.qrReaderPreviewBarrier;
                                            if (((Guideline) cma1.O(i, inflate)) != null) {
                                                i = obh0.qrReaderPreviewContainer;
                                                FrameLayout frameLayout4 = (FrameLayout) cma1.O(i, inflate);
                                                if (frameLayout4 != null) {
                                                    i = obh0.qrReaderSubtitle;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                                    if (appCompatTextView != null) {
                                                        i = obh0.qrReaderTitle;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                                        if (appCompatTextView2 != null) {
                                                            i = obh0.qrReaderTitleContainer;
                                                            FrameLayout frameLayout5 = (FrameLayout) cma1.O(i, inflate);
                                                            if (frameLayout5 != null) {
                                                                i = obh0.qrReaderToolbar;
                                                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                if (toolbarView != null) {
                                                                    return new r461((ConstraintLayout) inflate, appCompatImageView, qrReaderErrorView, operationProgressView, frameLayout, frameLayout2, appCompatImageView2, frameLayout3, appCompatImageView3, appCompatImageView4, frameLayout4, appCompatTextView, appCompatTextView2, frameLayout5, toolbarView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
