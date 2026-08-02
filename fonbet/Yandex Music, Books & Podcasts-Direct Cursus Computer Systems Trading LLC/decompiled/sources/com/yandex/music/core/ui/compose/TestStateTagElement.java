package com.yandex.music.core.ui.compose;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.k9s;
import defpackage.xci;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/core/ui/compose/TestStateTagElement;", "Ledi;", "Lk9s;", "shared-core-ui-compose-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final /* data */ class TestStateTagElement extends edi {
    public final Map a;

    public TestStateTagElement(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // defpackage.edi
    public final xci e() {
        Map map = this.a;
        map.getClass();
        k9s k9sVar = new k9s();
        k9sVar.o = map;
        return k9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TestStateTagElement) && Intrinsics.d(this.a, ((TestStateTagElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        k9s k9sVar = (k9s) xciVar;
        k9sVar.getClass();
        Map map = this.a;
        map.getClass();
        k9sVar.o = map;
    }

    public final String toString() {
        return "TestStateTagElement(dict=" + this.a + ")";
    }
}
