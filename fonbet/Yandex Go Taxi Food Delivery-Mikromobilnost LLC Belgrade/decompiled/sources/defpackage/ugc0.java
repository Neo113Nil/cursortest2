package defpackage;

import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;

/* loaded from: classes13.dex */
public final class ugc0 {
    public final String a;
    public final PlacesWebAuthType b;
    public final boolean c;

    public ugc0(String str, PlacesWebAuthType placesWebAuthType, boolean z, int i) {
        z = (i & 8) != 0 ? true : z;
        this.a = str;
        this.b = placesWebAuthType;
        this.c = z;
    }
}
