package com.yandex.plus.core.gradient.api;

import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends e {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ d(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // com.yandex.plus.core.gradient.api.e
    public final Shader a() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                int i = 1;
                if (arrayList.size() == 1) {
                    return ((e) arrayList.get(0)).a();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Shader a = ((e) it.next()).a();
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    return null;
                }
                Shader shader = (Shader) arrayList2.get(0);
                int size = arrayList2.size();
                while (i < size) {
                    ComposeShader composeShader = new ComposeShader(shader, (Shader) arrayList2.get(i), PorterDuff.Mode.SRC_OVER);
                    i++;
                    shader = composeShader;
                }
                return shader;
            default:
                return ((c) this.d).n();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.c;
        canvas.getClass();
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).draw(canvas);
                }
                break;
            default:
                Shader n = ((c) this.d).n();
                Paint paint = this.a;
                paint.setShader(n);
                canvas.drawRect(this.b, paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = this.c;
        rect.getClass();
        switch (i) {
            case 0:
                this.b.set(rect);
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).setBounds(rect);
                }
                break;
            default:
                this.b.set(rect);
                c cVar = (c) this.d;
                cVar.getClass();
                cVar.a(rect.left, rect.top, rect.right, rect.bottom);
                break;
        }
    }
}
