package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class ii1 implements zyc {
    public static final ii1 a = new ii1();

    public final boolean equals(Object obj) {
        if (obj instanceof ii1) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(5, hk1.class, "<init>", "<init>(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lru/yandex/music/data/domainitem/ArtistDomainItem;Lcom/yandex/music/shared/core/evgen/analytics/NavigationData;Ljava/lang/Object;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
