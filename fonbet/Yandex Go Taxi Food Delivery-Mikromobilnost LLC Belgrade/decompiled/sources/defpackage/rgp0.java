package defpackage;

import android.graphics.LinearGradient;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class rgp0 {
    public final int a;
    public final List b;
    public final LinearGradient c;

    public rgp0(int i, ArrayList arrayList, LinearGradient linearGradient, int i2) {
        List list = (i2 & 2) != 0 ? EmptyList.a : arrayList;
        this.a = i;
        this.b = list;
        this.c = linearGradient;
    }
}
