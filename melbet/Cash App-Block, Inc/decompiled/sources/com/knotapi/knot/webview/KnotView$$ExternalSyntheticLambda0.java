package com.knotapi.knot.webview;

import android.graphics.Bitmap;
import com.knotapi.knot.interfaces.ImageLoadCallback;
import com.knotapi.knot.webview.PopupChromeClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ KnotView$$ExternalSyntheticLambda0(String str, ImageLoadCallback imageLoadCallback) {
        this.$r8$classId = 3;
        this.f$1 = str;
        this.f$0 = imageLoadCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                ((ImageLoadCallback) obj).onImageLoaded((Bitmap) obj2);
                break;
            case 1:
                ((PopupChromeClient.AnonymousClass2) obj).lambda$onCardSwitchNativeError$0((String) obj2);
                break;
            case 2:
                JSInterfaceObject.lambda$addBreadcrumb$13((String) obj, (String) obj2);
                break;
            default:
                KnotView.lambda$preloadImage$1((String) obj2, (ImageLoadCallback) obj);
                break;
        }
    }

    public /* synthetic */ KnotView$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
