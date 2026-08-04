package com.gamericefishpro.space.i6;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return Float.valueOf(x.a.B((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.b = iRound;
                int i = eVar.f + 1;
                eVar.f = i;
                if (i == eVar.g) {
                    x.a(eVar.e, eVar.a, iRound, eVar.c, eVar.d);
                    eVar.f = 0;
                    eVar.g = 0;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.d = iRound2;
                int i2 = eVar2.g + 1;
                eVar2.g = i2;
                if (eVar2.f == i2) {
                    x.a(eVar2.e, eVar2.a, eVar2.b, eVar2.c, iRound2);
                    eVar2.f = 0;
                    eVar2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                x.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                float fFloatValue = ((Float) obj2).floatValue();
                x.a.N((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
