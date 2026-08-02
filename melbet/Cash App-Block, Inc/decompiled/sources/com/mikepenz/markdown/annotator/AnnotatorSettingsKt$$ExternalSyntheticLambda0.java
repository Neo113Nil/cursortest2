package com.mikepenz.markdown.annotator;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import com.mikepenz.markdown.model.ReferenceLinkHandlerImpl;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class AnnotatorSettingsKt$$ExternalSyntheticLambda0 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AnnotatorSettingsKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ReferenceLinkHandlerImpl referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) obj2;
                UriHandler uriHandler = (UriHandler) obj;
                linkAnnotation.getClass();
                LinkAnnotation.Url url = linkAnnotation instanceof LinkAnnotation.Url ? (LinkAnnotation.Url) linkAnnotation : null;
                String str = url != null ? url.url : null;
                if (str != null) {
                    if (referenceLinkHandlerImpl != null) {
                        LinkedHashMap linkedHashMap = referenceLinkHandlerImpl.stored;
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String str2 = (String) linkedHashMap.get(lowerCase);
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2.length() > 0 ? str2 : null;
                        if (str3 != null) {
                            str = str3;
                        }
                    }
                    try {
                        uriHandler.openUri(str);
                        break;
                    } catch (Throwable th) {
                        System.out.println((Object) CameraSelector$$ExternalSyntheticOutline0.m("Could not open the provided url: ", str, " // ", th.getMessage()));
                        return;
                    }
                }
                break;
            default:
                linkAnnotation.getClass();
                ((Function1) obj2).invoke(((TemplateCardViewModel.DisplayTextSegment.Token) obj).placeholderKey);
                break;
        }
    }
}
