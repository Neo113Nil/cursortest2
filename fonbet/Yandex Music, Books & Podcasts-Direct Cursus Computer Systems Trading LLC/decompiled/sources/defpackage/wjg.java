package defpackage;

import com.yandex.music.shared.skeleton.blocks.tabs.TabDataDto;
import com.yandex.music.shared.skeleton.blocks.tabs.TabsBlockDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockActionDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockSourceDto;
import com.yandex.music.shared.skeleton.data.core.block.common.local.LocalBlockCoverDto;
import com.yandex.music.shared.skeleton.data.core.block.common.local.LocalBlockDataDto;
import com.yandex.music.shared.skeleton.data.core.block.common.local.LocalDataBlockDto;
import com.yandex.music.shared.skeleton.data.core.block.common.remote.RemoteBlockDataDto;
import com.yandex.music.shared.skeleton.data.core.block.common.remote.RemoteDataBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class wjg implements fnq {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wjg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fnq
    public final Class a() {
        switch (this.a) {
            case 0:
                return LocalDataBlockDto.class;
            case 1:
                return RemoteDataBlockDto.class;
            default:
                return TabsBlockDto.class;
        }
    }

    @Override // defpackage.fnq
    public final drf b(inq inqVar) {
        vjg vjgVar;
        LocalBlockCoverDto cover;
        tun tunVar;
        RemoteBlockDataDto data;
        SkeletonBlockSourceDto source;
        onq z0;
        String deeplink;
        nrf S;
        switch (this.a) {
            case 0:
                LocalDataBlockDto localDataBlockDto = (LocalDataBlockDto) inqVar;
                Function1 function1 = (Function1) this.b;
                nrf S2 = v5g.S(localDataBlockDto);
                String str = null;
                if (S2 == null) {
                    vjgVar = null;
                } else {
                    gos gosVar = f73.b;
                    LocalBlockDataDto data2 = localDataBlockDto.getData();
                    String showPolicy = data2 != null ? data2.getShowPolicy() : null;
                    gosVar.getClass();
                    f73 s = gos.s(showPolicy);
                    LocalBlockDataDto data3 = localDataBlockDto.getData();
                    String title = data3 != null ? data3.getTitle() : null;
                    LocalBlockDataDto data4 = localDataBlockDto.getData();
                    String description = data4 != null ? data4.getDescription() : null;
                    LocalBlockDataDto data5 = localDataBlockDto.getData();
                    if (data5 != null && (cover = data5.getCover()) != null) {
                        str = cover.getUri();
                    }
                    vjgVar = new vjg(S2, s, title, description, str);
                }
                return (drf) function1.invoke(vjgVar);
            case 1:
                RemoteDataBlockDto remoteDataBlockDto = (RemoteDataBlockDto) inqVar;
                Function1 function12 = (Function1) this.b;
                nrf S3 = v5g.S(remoteDataBlockDto);
                enq enqVar = null;
                if (S3 == null || (data = remoteDataBlockDto.getData()) == null || (source = data.getSource()) == null || (z0 = y5g.z0(source)) == null) {
                    tunVar = null;
                } else {
                    gos gosVar2 = f73.b;
                    String showPolicy2 = remoteDataBlockDto.getData().getShowPolicy();
                    gosVar2.getClass();
                    f73 s2 = gos.s(showPolicy2);
                    String title2 = remoteDataBlockDto.getData().getTitle();
                    String description2 = remoteDataBlockDto.getData().getDescription();
                    SkeletonBlockActionDto viewAllAction = remoteDataBlockDto.getData().getViewAllAction();
                    if (viewAllAction != null && (deeplink = viewAllAction.getDeeplink()) != null && !StringsKt.U(deeplink)) {
                        enqVar = new enq(viewAllAction.getDeeplink());
                    }
                    tunVar = new tun(S3, z0, s2, title2, description2, enqVar);
                }
                return (uvn) function12.invoke(tunVar);
            default:
                TabsBlockDto tabsBlockDto = (TabsBlockDto) inqVar;
                if (tabsBlockDto.getData() == null || (S = v5g.S(tabsBlockDto)) == null) {
                    return null;
                }
                SkeletonBlockSourceDto source2 = tabsBlockDto.getData().getSource();
                onq z02 = source2 != null ? y5g.z0(source2) : null;
                Integer selectedTabIndex = tabsBlockDto.getData().getSelectedTabIndex();
                int intValue = selectedTabIndex != null ? selectedTabIndex.intValue() : 0;
                List tabs = tabsBlockDto.getData().getTabs();
                if (tabs == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = tabs.iterator();
                while (it.hasNext()) {
                    r0s N = zdg.N((TabDataDto) it.next(), (gnq) ((kme) this.b).a);
                    if (N == null || N.e.isEmpty()) {
                        N = null;
                    }
                    if (N != null) {
                        arrayList.add(N);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return new m2s(S, intValue, arrayList, z02);
                }
                return null;
        }
    }
}
