package ru.yandex.video.m3.player.baseurls;

import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00030\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010 R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010.\u001a\n #*\u0004\u0018\u00010\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*¨\u00061"}, d2 = {"Lru/yandex/video/m3/player/baseurls/NonEmptyBaseUrlsManagerImpl;", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "", "", "baseUrls", "", "enableLogs", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "baseUrlInBlacklistAddedListener", "<init>", "(Ljava/util/List;ZLru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;)V", "selectOptimalBaseUrl", "()Z", "Lzy11;", "putCurrentSelectedBaseUrlToBlacklist", "()V", "baseUrlPostfix", "setBaseUrlPostfix", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "onChunkLoadError", "", "getAvailableBaseUrlsCount", "()I", "newBaseUrls", "updateBaseUrls", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "restoredBaseUrl", "onBaseUrlRemovedFromBlacklist", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "Z", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "kotlin.jvm.PlatformType", "internalBaseUrls", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "blackList", "Ljava/util/concurrent/CopyOnWriteArraySet;", "alwaysWhiteBaseUrl", "Ljava/lang/String;", "isAlwaysWhiteBaseUrlSelected", "alwaysWhiteBaseUrlUses", CA20Status.STATUS_USER_I, "selectedBaseUrl", "lastGivenBaseUrl", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NonEmptyBaseUrlsManagerImpl implements SingleTrackTypeBaseUrlsManager {
    public static final int MAX_SEQUENTLY_ATTEMPT_TO_USE_ANYCAST = 3;
    private volatile String alwaysWhiteBaseUrl;
    private volatile int alwaysWhiteBaseUrlUses;
    private final BaseUrlInBlacklistAddedListener baseUrlInBlacklistAddedListener;
    private volatile String baseUrlPostfix;
    private final CopyOnWriteArraySet<String> blackList;
    private final boolean enableLogs;
    private final CopyOnWriteArrayList<String> internalBaseUrls;
    private volatile boolean isAlwaysWhiteBaseUrlSelected;
    private String lastGivenBaseUrl;
    private volatile String selectedBaseUrl;
    public static final int $stable = 8;

    public NonEmptyBaseUrlsManagerImpl(List<String> list, boolean z, BaseUrlInBlacklistAddedListener baseUrlInBlacklistAddedListener) {
        this.enableLogs = z;
        this.baseUrlInBlacklistAddedListener = baseUrlInBlacklistAddedListener;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        this.internalBaseUrls = copyOnWriteArrayList;
        this.blackList = new CopyOnWriteArraySet<>();
        this.alwaysWhiteBaseUrl = (String) a.Z(copyOnWriteArrayList);
        this.isAlwaysWhiteBaseUrlSelected = copyOnWriteArrayList.size() == 1;
        this.selectedBaseUrl = (String) a.P(copyOnWriteArrayList);
        if (z) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("alwaysWhiteBaseUrl=" + NonEmptyBaseUrlsManagerImplKt.logBaseUrl(this.alwaysWhiteBaseUrl) + HexString.CHAR_SPACE + this, new Object[0]);
            d5z0Var.t("BaseUrlStrategy");
            StringBuilder sb = new StringBuilder("Inited with ");
            sb.append(NonEmptyBaseUrlsManagerImplKt.logBaseUrls(list));
            d5z0Var.a(sb.toString(), new Object[0]);
        }
    }

    private final void putCurrentSelectedBaseUrlToBlacklist() {
        if (this.isAlwaysWhiteBaseUrlSelected) {
            return;
        }
        this.blackList.add(this.selectedBaseUrl);
        this.baseUrlInBlacklistAddedListener.onBaseUrlAddedInBlacklist(new BaseUrl(this.selectedBaseUrl, 0));
    }

    private final boolean selectOptimalBaseUrl() {
        if (this.enableLogs) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("selectOptimalBaseUrl internalBaseUrls:\n " + NonEmptyBaseUrlsManagerImplKt.logBaseUrls(this.internalBaseUrls) + "\nblackList:\n " + NonEmptyBaseUrlsManagerImplKt.logBaseUrls(a.J0(this.blackList)) + HexString.CHAR_SPACE + this, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.internalBaseUrls);
        Iterator it = arrayList.iterator();
        int i = 0;
        String str = null;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str2 = (String) next;
            if (!this.blackList.contains(str2) && i < arrayList.size() - 1 && str == null) {
                str = str2;
            }
            i = i2;
        }
        if (str != null) {
            this.isAlwaysWhiteBaseUrlSelected = false;
            if (this.enableLogs) {
                d5z0 d5z0Var2 = h5z0.a;
                d5z0Var2.t("BaseUrlStrategy");
                d5z0Var2.a("nextSelectedBaseUrl = " + NonEmptyBaseUrlsManagerImplKt.logBaseUrl(str), new Object[0]);
            }
            this.selectedBaseUrl = str;
            this.alwaysWhiteBaseUrlUses = 0;
            return true;
        }
        this.isAlwaysWhiteBaseUrlSelected = true;
        if (this.enableLogs) {
            d5z0 d5z0Var3 = h5z0.a;
            d5z0Var3.t("BaseUrlStrategy");
            StringBuilder sb = new StringBuilder("nextSelectedBaseUrl alwaysWhite ");
            String str3 = this.alwaysWhiteBaseUrl;
            sb.append(str3 != null ? NonEmptyBaseUrlsManagerImplKt.logBaseUrl(str3) : null);
            d5z0Var3.a(sb.toString(), new Object[0]);
        }
        this.alwaysWhiteBaseUrlUses++;
        if (this.alwaysWhiteBaseUrlUses >= 3) {
            return false;
        }
        this.selectedBaseUrl = this.alwaysWhiteBaseUrl;
        return true;
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public int getAvailableBaseUrlsCount() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.internalBaseUrls;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (!this.blackList.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (this.enableLogs) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("getAvailableBaseUrlsCount", new Object[0]);
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("availableBaseUrls " + NonEmptyBaseUrlsManagerImplKt.logBaseUrls(arrayList), new Object[0]);
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("alwaysWhiteBaseUrl " + NonEmptyBaseUrlsManagerImplKt.logBaseUrl(this.alwaysWhiteBaseUrl), new Object[0]);
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("alwaysWhiteBaseUrlUses " + this.alwaysWhiteBaseUrlUses, new Object[0]);
        }
        if (arrayList.size() == 1 && jl40.l(a.P(arrayList), this.alwaysWhiteBaseUrl) && this.alwaysWhiteBaseUrlUses >= 3) {
            return 0;
        }
        int min = Math.min((arrayList.size() + 3) - this.alwaysWhiteBaseUrlUses, this.internalBaseUrls.size());
        if (this.enableLogs) {
            d5z0 d5z0Var2 = h5z0.a;
            d5z0Var2.t("BaseUrlStrategy");
            d5z0Var2.a("after all " + min + " AvailableBaseUrls", new Object[0]);
        }
        return min;
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public String getBaseUrl() {
        String str = this.lastGivenBaseUrl;
        if (str == null || !str.equals(this.selectedBaseUrl)) {
            if (this.enableLogs) {
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("BaseUrlStrategy");
                d5z0Var.d("getBaseUrl. Returned NEW " + NonEmptyBaseUrlsManagerImplKt.logBaseUrl(this.selectedBaseUrl) + " baseUrlPostfix=" + this.baseUrlPostfix + HexString.CHAR_SPACE + this, new Object[0]);
            }
            this.lastGivenBaseUrl = this.selectedBaseUrl;
        }
        String str2 = this.baseUrlPostfix;
        String str3 = this.selectedBaseUrl;
        if (str2 == null) {
            return str3;
        }
        StringBuilder t = qv10.t(str3);
        t.append(this.baseUrlPostfix);
        return t.toString();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlFromBlackListRemovedListener
    public void onBaseUrlRemovedFromBlacklist(BaseUrl restoredBaseUrl) {
        if (this.enableLogs) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("onBaseUrlRemovedFromBlacklist ", new Object[0]);
        }
        this.blackList.remove(restoredBaseUrl.getUrl());
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public boolean onChunkLoadError() {
        if (this.enableLogs) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.d("onChunkLoadError", new Object[0]);
        }
        putCurrentSelectedBaseUrlToBlacklist();
        return selectOptimalBaseUrl();
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void setBaseUrlPostfix(String baseUrlPostfix) {
        this.baseUrlPostfix = baseUrlPostfix;
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void updateBaseUrls(List<String> newBaseUrls) {
        List<String> list = newBaseUrls;
        if (list.isEmpty()) {
            return;
        }
        if (!jl40.l(this.internalBaseUrls, newBaseUrls) && this.enableLogs) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("BaseUrlStrategy");
            d5z0Var.a("updated on " + NonEmptyBaseUrlsManagerImplKt.logBaseUrls(newBaseUrls) + "\nblackList:\n " + NonEmptyBaseUrlsManagerImplKt.logBaseUrls(a.J0(this.blackList)), new Object[0]);
        }
        this.internalBaseUrls.clear();
        this.internalBaseUrls.addAll(list);
        String str = (String) a.Z(newBaseUrls);
        if (!jl40.l(this.alwaysWhiteBaseUrl, str)) {
            this.alwaysWhiteBaseUrl = str;
            this.alwaysWhiteBaseUrlUses = 0;
        }
        if (!newBaseUrls.contains(this.selectedBaseUrl)) {
            selectOptimalBaseUrl();
        }
        if (this.enableLogs) {
            d5z0 d5z0Var2 = h5z0.a;
            d5z0Var2.t("BaseUrlStrategy");
            d5z0Var2.a("after updateBaseUrls optimal is " + NonEmptyBaseUrlsManagerImplKt.logBaseUrl(this.selectedBaseUrl), new Object[0]);
        }
    }
}
