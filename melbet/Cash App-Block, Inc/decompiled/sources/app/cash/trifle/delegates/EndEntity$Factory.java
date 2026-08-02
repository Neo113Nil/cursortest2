package app.cash.trifle.delegates;

import androidx.camera.view.PreviewView;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.clientroutes.ClientRoute;
import java.security.KeyPair;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class EndEntity$Factory {
    public static PreviewView.AnonymousClass1 get(KeyPair keyPair) {
        keyPair.getClass();
        return new PreviewView.AnonymousClass1(new AndroidSvg(keyPair), false);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewEquities.deepLinkSpecs;
    }
}
