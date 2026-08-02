package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class xf4 {
    public static final boolean a(BackendConfig.Restrictions restrictions, int i) {
        BackendConfig.Restrictions.NamespacesDescriptor enabledChats = restrictions.getEnabledChats();
        List<Integer> channelNamespaces = enabledChats != null ? enabledChats.getChannelNamespaces() : null;
        BackendConfig.Restrictions.NamespacesDescriptor disabledChats = restrictions.getDisabledChats();
        Boolean e = e(channelNamespaces, disabledChats != null ? disabledChats.getChannelNamespaces() : null, i);
        if (e != null) {
            return e.booleanValue();
        }
        String channels = restrictions.getChannels();
        if (channels == null) {
            channels = restrictions.getDefaultValue();
        }
        return jl40.l(channels, BackendConfig.Restrictions.ENABLED);
    }

    public static final boolean b(BackendConfig.Restrictions restrictions, j3b j3bVar) {
        int i = j3bVar.O;
        if (j3bVar.D) {
            String chatsWithBot = restrictions.getChatsWithBot();
            if (chatsWithBot == null) {
                chatsWithBot = restrictions.getDefaultValue();
            }
            return jl40.l(chatsWithBot, BackendConfig.Restrictions.ENABLED);
        }
        boolean z = j3bVar.C;
        if (!z && !j3bVar.G) {
            return j3bVar.I ? a(restrictions, i) : !z ? d(restrictions, i) : jl40.l(restrictions.getDefaultValue(), BackendConfig.Restrictions.ENABLED);
        }
        String privateChats = restrictions.getPrivateChats();
        if (privateChats == null) {
            privateChats = restrictions.getDefaultValue();
        }
        return jl40.l(privateChats, BackendConfig.Restrictions.ENABLED);
    }

    public static final boolean c(BackendConfig.Restrictions restrictions, o1b0 o1b0Var) {
        int i = o1b0Var.o;
        if (o1b0Var.f) {
            String chatsWithBot = restrictions.getChatsWithBot();
            if (chatsWithBot == null) {
                chatsWithBot = restrictions.getDefaultValue();
            }
            return jl40.l(chatsWithBot, BackendConfig.Restrictions.ENABLED);
        }
        boolean z = o1b0Var.d;
        if (!z && !o1b0Var.e) {
            return o1b0Var.n ? a(restrictions, i) : !z ? d(restrictions, i) : jl40.l(restrictions.getDefaultValue(), BackendConfig.Restrictions.ENABLED);
        }
        String privateChats = restrictions.getPrivateChats();
        if (privateChats == null) {
            privateChats = restrictions.getDefaultValue();
        }
        return jl40.l(privateChats, BackendConfig.Restrictions.ENABLED);
    }

    public static final boolean d(BackendConfig.Restrictions restrictions, int i) {
        BackendConfig.Restrictions.NamespacesDescriptor enabledChats = restrictions.getEnabledChats();
        List<Integer> groupsNamespaces = enabledChats != null ? enabledChats.getGroupsNamespaces() : null;
        BackendConfig.Restrictions.NamespacesDescriptor disabledChats = restrictions.getDisabledChats();
        Boolean e = e(groupsNamespaces, disabledChats != null ? disabledChats.getGroupsNamespaces() : null, i);
        if (e != null) {
            return e.booleanValue();
        }
        String groups = restrictions.getGroups();
        if (groups == null) {
            groups = restrictions.getDefaultValue();
        }
        return jl40.l(groups, BackendConfig.Restrictions.ENABLED);
    }

    public static final Boolean e(List list, List list2, int i) {
        if (list2 != null && list2.contains(Integer.valueOf(i))) {
            return Boolean.FALSE;
        }
        if (list == null || !list.contains(Integer.valueOf(i))) {
            return null;
        }
        return Boolean.TRUE;
    }
}
