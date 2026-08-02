package defpackage;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.PlacemarkMapObject;

/* loaded from: classes6.dex */
public final /* synthetic */ class x4v implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlacemarkMapObject b;

    public /* synthetic */ x4v(PlacemarkMapObject placemarkMapObject, int i) {
        this.a = i;
        this.b = placemarkMapObject;
    }

    @Override // com.yandex.mapkit.map.Callback
    public final void onTaskFinished() {
        int i = this.a;
        PlacemarkMapObject placemarkMapObject = this.b;
        switch (i) {
            case 0:
                placemarkMapObject.setVisible(true);
                break;
            case 1:
                placemarkMapObject.setVisible(true);
                break;
            default:
                placemarkMapObject.setVisible(true);
                break;
        }
    }
}
