package defpackage;

import com.yandex.mapkit.directions.driving.ConditionsListener;

/* loaded from: classes7.dex */
public final class xyd implements ConditionsListener {
    public final /* synthetic */ imj a;
    public final /* synthetic */ String b;

    public xyd(imj imjVar, String str) {
        this.a = imjVar;
        this.b = str;
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsOutdated() {
        this.a.c(new xc8(this.b, 6));
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsUpdated() {
        this.a.c(new xc8(this.b, 5));
    }
}
