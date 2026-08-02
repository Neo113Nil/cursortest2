package com.yandex.music.core.ui.compose;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.e9s;
import defpackage.edi;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/core/ui/compose/TestIndexTagElement;", "Ledi;", "Le9s;", "shared-core-ui-compose-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final /* data */ class TestIndexTagElement extends edi {
    public final int a;

    public TestIndexTagElement(int i) {
        this.a = i;
    }

    @Override // defpackage.edi
    public final xci e() {
        e9s e9sVar = new e9s();
        e9sVar.o = this.a;
        return e9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TestIndexTagElement) && this.a == ((TestIndexTagElement) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        e9s e9sVar = (e9s) xciVar;
        e9sVar.getClass();
        e9sVar.o = this.a;
    }

    public final String toString() {
        return dfi.c(this.a, "TestIndexTagElement(index=", ")");
    }
}
