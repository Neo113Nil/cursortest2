package defpackage;

import com.yandex.go.eboks.objects.api.MapObjectAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class qgn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapObjectAction.values().length];
        try {
            iArr[MapObjectAction.SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapObjectAction.DESELECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
