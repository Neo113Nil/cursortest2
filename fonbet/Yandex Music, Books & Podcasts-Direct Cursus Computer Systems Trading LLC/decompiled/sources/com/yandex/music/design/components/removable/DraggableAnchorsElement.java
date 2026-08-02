package com.yandex.music.design.components.removable;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.ja0;
import defpackage.soa;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/design/components/removable/DraggableAnchorsElement;", "T", "Ledi;", "Lsoa;", "shared-core-ui-music-design"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final class DraggableAnchorsElement<T> extends edi {
    public final ja0 a;
    public final Function2 b;

    public DraggableAnchorsElement(ja0 ja0Var, Function2 function2) {
        bxj bxjVar = bxj.a;
        this.a = ja0Var;
        this.b = function2;
    }

    @Override // defpackage.edi
    public final xci e() {
        bxj bxjVar = bxj.b;
        soa soaVar = new soa();
        soaVar.o = this.a;
        soaVar.p = this.b;
        soaVar.q = bxjVar;
        return soaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (!this.a.equals(draggableAnchorsElement.a) || this.b != draggableAnchorsElement.b) {
            return false;
        }
        bxj bxjVar = bxj.a;
        return true;
    }

    public final int hashCode() {
        return bxj.b.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        soa soaVar = (soa) xciVar;
        soaVar.getClass();
        soaVar.o = this.a;
        soaVar.p = this.b;
        soaVar.q = bxj.b;
    }
}
