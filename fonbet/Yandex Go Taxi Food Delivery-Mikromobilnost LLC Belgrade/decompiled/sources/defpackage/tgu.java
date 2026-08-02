package defpackage;

/* loaded from: classes15.dex */
public final class tgu {

    @xuf0(tag = 1)
    public sgu hideChat;

    @xuf0(tag = 2)
    public ugu showChat;

    public tgu(int i) {
        this.hideChat = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgu) && jl40.l(this.hideChat, ((tgu) obj).hideChat);
    }

    public final int hashCode() {
        sgu sguVar = this.hideChat;
        return (sguVar == null ? 0 : sguVar.hashCode()) * 31;
    }

    public final String toString() {
        return "Operation(hideChat=" + this.hideChat + ", showChat=null)";
    }

    public tgu() {
        this(0);
    }
}
