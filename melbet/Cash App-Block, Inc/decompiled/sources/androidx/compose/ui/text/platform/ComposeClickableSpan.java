package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;

/* loaded from: classes3.dex */
public final class ComposeClickableSpan extends ClickableSpan {
    public final LinkAnnotation link;

    public ComposeClickableSpan(LinkAnnotation linkAnnotation) {
        this.link = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        LinkAnnotation linkAnnotation = this.link;
        LinkInteractionListener linkInteractionListener = linkAnnotation.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.onClick(linkAnnotation);
        }
    }
}
