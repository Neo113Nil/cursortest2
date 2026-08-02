package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import androidx.lifecycle.Observer;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.view.HintView;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class DocumentAnalysisFragment$$ExternalSyntheticLambda7 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MiSnapWorkflowViewModel f$0;
    public final /* synthetic */ DocumentAnalysisFragment f$1;

    public /* synthetic */ DocumentAnalysisFragment$$ExternalSyntheticLambda7(MiSnapWorkflowViewModel miSnapWorkflowViewModel, DocumentAnalysisFragment documentAnalysisFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = miSnapWorkflowViewModel;
        this.f$1 = documentAnalysisFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChanged(Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        String string2;
        int i4;
        int i5 = this.$r8$classId;
        DocumentAnalysisFragment documentAnalysisFragment = this.f$1;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.f$0;
        switch (i5) {
            case 0:
                MiSnapController.FeedbackResult feedbackResult = (MiSnapController.FeedbackResult) obj;
                DocumentAnalysisFragment.Companion companion = DocumentAnalysisFragment.Companion;
                miSnapWorkflowViewModel.getClass();
                if (feedbackResult != null) {
                    UserAction userAction = feedbackResult.a;
                    miSnapWorkflowViewModel.a.handleFrameWarnings(feedbackResult.d);
                    HintView hintView = documentAnalysisFragment.getBinding$workflow_release().i;
                    boolean z = userAction instanceof UserAction.Document.NOT_FOUND;
                    String str2 = "";
                    if (z) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewNotFoundAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.MRZ_NOT_FOUND) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewMrzNotFoundAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.HOLD_STILL) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewHoldStillAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.REDUCE_GLARE) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewReduceGlareAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.STRAIGHTEN) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewStraightenAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.TOO_BRIGHT) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooBrightAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.TOO_DARK) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooDarkAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.TOO_CLOSE) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooCloseAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.TOO_FAR) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooFarAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.USE_DARK_BACKGROUND) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewUseDarkBackgroundAccessibilityMessage;
                    } else if (userAction instanceof UserAction.Document.USE_PLAIN_BACKGROUND) {
                        i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewUsePlainBackgroundAccessibilityMessage;
                    } else {
                        if (userAction instanceof UserAction.Document.WRONG_DOCUMENT) {
                            MiSnapSettings miSnapSettings = (MiSnapSettings) documentAnalysisFragment.b$1().f.getValue();
                            if (miSnapSettings != null) {
                                int i6 = DocumentAnalysisFragment.a.b[miSnapSettings.a.ordinal()];
                                if (i6 == 1) {
                                    i2 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentPassportAccessibilityMessage;
                                } else if (i6 == 2) {
                                    i2 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentIdFrontAccessibilityMessage;
                                } else if (i6 == 3) {
                                    i2 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentIdBackAccessibilityMessage;
                                } else if (i6 == 4) {
                                    i2 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentCheckFrontAccessibilityMessage;
                                } else if (i6 == 5) {
                                    i2 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentCheckBackAccessibilityMessage;
                                }
                                str = documentAnalysisFragment.getString(i2);
                                str.getClass();
                            }
                            str = documentAnalysisFragment.getString(R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentDefaultAccessibilityMessage);
                            str.getClass();
                        } else if (userAction instanceof UserAction.Document.PRESS_MANUAL_BUTTON) {
                            i = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewPressManualButtonAccessibilityMessage;
                        } else if (userAction instanceof UserAction.Barcode.NOT_FOUND) {
                            i = R.string.misnapWorkflowBarcodeAnalysisFragmentHintViewNotFoundAccessibilityMessage;
                        } else {
                            str = "";
                        }
                        str.getClass();
                        hintView.setContentDescription(str);
                        HintView hintView2 = documentAnalysisFragment.getBinding$workflow_release().i;
                        if (!z) {
                            i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewNotFoundMessage;
                        } else if (!(userAction instanceof UserAction.Document.MRZ_NOT_FOUND)) {
                            if (!(userAction instanceof UserAction.Document.HOLD_STILL)) {
                                if (!(userAction instanceof UserAction.Document.REDUCE_GLARE)) {
                                    if (!(userAction instanceof UserAction.Document.STRAIGHTEN)) {
                                        if (!(userAction instanceof UserAction.Document.TOO_BRIGHT)) {
                                            if (!(userAction instanceof UserAction.Document.TOO_DARK)) {
                                                if (!(userAction instanceof UserAction.Document.TOO_CLOSE)) {
                                                    if (!(userAction instanceof UserAction.Document.TOO_FAR)) {
                                                        if (!(userAction instanceof UserAction.Document.USE_DARK_BACKGROUND)) {
                                                            if (!(userAction instanceof UserAction.Document.USE_PLAIN_BACKGROUND)) {
                                                                if (userAction instanceof UserAction.Document.WRONG_DOCUMENT) {
                                                                    MiSnapSettings miSnapSettings2 = (MiSnapSettings) documentAnalysisFragment.b$1().f.getValue();
                                                                    if (miSnapSettings2 != null) {
                                                                        int i7 = DocumentAnalysisFragment.a.b[miSnapSettings2.a.ordinal()];
                                                                        if (i7 == 1) {
                                                                            i4 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentPassportMessage;
                                                                        } else if (i7 == 2) {
                                                                            i4 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentIdFrontMessage;
                                                                        } else if (i7 == 3) {
                                                                            i4 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentIdBackMessage;
                                                                        } else if (i7 == 4) {
                                                                            i4 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentCheckFrontMessage;
                                                                        } else if (i7 == 5) {
                                                                            i4 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentCheckBackMessage;
                                                                        }
                                                                        string2 = documentAnalysisFragment.getString(i4);
                                                                        string2.getClass();
                                                                        str2 = string2;
                                                                    }
                                                                    string2 = documentAnalysisFragment.getString(R.string.misnapWorkflowDocumentAnalysisFragmentHintViewWrongDocumentDefaultMessage);
                                                                    string2.getClass();
                                                                    str2 = string2;
                                                                } else if (userAction instanceof UserAction.Document.PRESS_MANUAL_BUTTON) {
                                                                    i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewPressManualButtonMessage;
                                                                } else if (userAction instanceof UserAction.Barcode.NOT_FOUND) {
                                                                    i3 = R.string.misnapWorkflowBarcodeAnalysisFragmentHintViewNotFoundMessage;
                                                                }
                                                                str2.getClass();
                                                                hintView2.setText(str2);
                                                                break;
                                                            } else {
                                                                i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewUsePlainBackgroundMessage;
                                                            }
                                                        } else {
                                                            i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewUseDarkBackgroundMessage;
                                                        }
                                                    } else {
                                                        i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooFarMessage;
                                                    }
                                                } else {
                                                    i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooCloseMessage;
                                                }
                                            } else {
                                                i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooDarkMessage;
                                            }
                                        } else {
                                            i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewTooBrightMessage;
                                        }
                                    } else {
                                        i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewStraightenMessage;
                                    }
                                } else {
                                    i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewReduceGlareMessage;
                                }
                            } else {
                                i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewHoldStillMessage;
                            }
                        } else {
                            i3 = R.string.misnapWorkflowDocumentAnalysisFragmentHintViewMrzNotFoundMessage;
                        }
                        str2 = documentAnalysisFragment.getString(i3);
                        str2.getClass();
                        hintView2.setText(str2);
                    }
                    str = documentAnalysisFragment.getString(i);
                    str.getClass();
                    hintView.setContentDescription(str);
                    HintView hintView22 = documentAnalysisFragment.getBinding$workflow_release().i;
                    if (!z) {
                    }
                    str2 = documentAnalysisFragment.getString(i3);
                    str2.getClass();
                    hintView22.setText(str2);
                }
                break;
            case 1:
                DocumentAnalysisFragment.a(miSnapWorkflowViewModel, documentAnalysisFragment, (MiSnapController.ErrorResult) obj);
                break;
            default:
                FrameProducer.Event event = (FrameProducer.Event) obj;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                miSnapWorkflowViewModel.getClass();
                if (event != null) {
                    if ((event instanceof FrameProducer.Event.InitializationError) || (event instanceof FrameProducer.Event.TakePhotoError)) {
                        Context requireContext = documentAnalysisFragment.requireContext();
                        requireContext.getClass();
                        miSnapWorkflowViewModel.postError$workflow_release(requireContext, MiSnapWorkflowError.Camera.INSTANCE);
                        break;
                    }
                }
                break;
        }
    }
}
