package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class CatchingFishGsonToolbar extends CatchingFishRealmHilt {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;

    public CatchingFishGsonToolbar(List list) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(list, "delegate");
        this.CatchingFishDaggerWebsocket = list;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((CatchingFishBundleGlide) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket).groupCount() + 1;
            default:
                return ((List) this.CatchingFishDaggerWebsocket).size();
        }
    }

    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String group = ((Matcher) ((CatchingFishBundleGlide) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket).group(i);
                return group == null ? "" : group;
            default:
                List list = (List) this.CatchingFishDaggerWebsocket;
                if (i >= 0 && i <= CatchingFishToastCustomView.CatchingFishMotionLayout(this)) {
                    return list.get(CatchingFishToastCustomView.CatchingFishMotionLayout(this) - i);
                }
                throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new CatchingFishLifecycleMoshi(0, CatchingFishToastCustomView.CatchingFishMotionLayout(this), 1) + "].");
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return new CatchingFishMVIJUnit(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public ListIterator listIterator() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return new CatchingFishMVIJUnit(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return new CatchingFishMVIJUnit(this, i);
            default:
                return super.listIterator(i);
        }
    }

    public CatchingFishGsonToolbar(CatchingFishBundleGlide catchingFishBundleGlide) {
        this.CatchingFishDaggerWebsocket = catchingFishBundleGlide;
    }
}
