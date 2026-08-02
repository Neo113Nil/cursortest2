package ru.yandex.video.m3.list_player_manager.impl.image;

import androidx.fragment.app.FragmentActivity;
import defpackage.bu31;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/ActivityViewSizeProvider;", "T", "Lbu31;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function0;", "Lzy11;", "sizeReadyCallback", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lsls;)V", "", "width", "height", "onSizeReady", "(II)V", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityViewSizeProvider<T> extends bu31 {
    public static final int $stable = 8;
    private sls sizeReadyCallback;

    public ActivityViewSizeProvider(FragmentActivity fragmentActivity, sls slsVar) {
        super(fragmentActivity.getWindow().getDecorView());
        this.sizeReadyCallback = slsVar;
    }

    @Override // defpackage.bu31, defpackage.ojs0
    public void onSizeReady(int width, int height) {
        super.onSizeReady(width, height);
        sls slsVar = this.sizeReadyCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.sizeReadyCallback = null;
    }
}
