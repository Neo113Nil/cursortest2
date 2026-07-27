package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishMVIJUnit implements ListIterator, CatchingFishCardViewFAB {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public CatchingFishMVIJUnit(CatchingFishGsonToolbar catchingFishGsonToolbar, int i) {
        this.CatchingFishWorkManager = catchingFishGsonToolbar;
        List list = (List) catchingFishGsonToolbar.CatchingFishDaggerWebsocket;
        if (i >= 0 && i <= catchingFishGsonToolbar.CatchingFishParcelableFAB()) {
            this.CatchingFishDaggerWebsocket = list.listIterator(catchingFishGsonToolbar.CatchingFishParcelableFAB() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new CatchingFishLifecycleMoshi(0, catchingFishGsonToolbar.CatchingFishParcelableFAB(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.CatchingFishDaggerWebsocket).hasPrevious();
            default:
                return ((CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor < ((CatchingFishRoomGradleMoshi) this.CatchingFishWorkManager).CatchingFishViewModelScope - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.CatchingFishDaggerWebsocket).hasNext();
            default:
                return ((CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.CatchingFishDaggerWebsocket).previous();
            default:
                CatchingFishAdMobRoom catchingFishAdMobRoom = (CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket;
                int i = catchingFishAdMobRoom.CatchingFishReduxKtor + 1;
                CatchingFishRoomGradleMoshi catchingFishRoomGradleMoshi = (CatchingFishRoomGradleMoshi) this.CatchingFishWorkManager;
                CatchingFishXMLLayoutGlide.CatchingFishLayout(i, catchingFishRoomGradleMoshi.CatchingFishViewModelScope);
                catchingFishAdMobRoom.CatchingFishReduxKtor = i;
                return catchingFishRoomGradleMoshi.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGsonToolbar catchingFishGsonToolbar = (CatchingFishGsonToolbar) this.CatchingFishWorkManager;
                return CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishGsonToolbar) - ((ListIterator) this.CatchingFishDaggerWebsocket).previousIndex();
            default:
                return ((CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.CatchingFishDaggerWebsocket).next();
            default:
                CatchingFishAdMobRoom catchingFishAdMobRoom = (CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket;
                int i = catchingFishAdMobRoom.CatchingFishReduxKtor;
                CatchingFishRoomGradleMoshi catchingFishRoomGradleMoshi = (CatchingFishRoomGradleMoshi) this.CatchingFishWorkManager;
                CatchingFishXMLLayoutGlide.CatchingFishLayout(i, catchingFishRoomGradleMoshi.CatchingFishViewModelScope);
                catchingFishAdMobRoom.CatchingFishReduxKtor = i - 1;
                return catchingFishRoomGradleMoshi.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGsonToolbar catchingFishGsonToolbar = (CatchingFishGsonToolbar) this.CatchingFishWorkManager;
                return CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishGsonToolbar) - ((ListIterator) this.CatchingFishDaggerWebsocket).nextIndex();
            default:
                return ((CatchingFishAdMobRoom) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public CatchingFishMVIJUnit(CatchingFishAdMobRoom catchingFishAdMobRoom, CatchingFishRoomGradleMoshi catchingFishRoomGradleMoshi) {
        this.CatchingFishDaggerWebsocket = catchingFishAdMobRoom;
        this.CatchingFishWorkManager = catchingFishRoomGradleMoshi;
    }
}
