package ru.yandex.taxi.net.taxi.dto.objects;

import defpackage.acj;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ycj;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/objects/Dialog;", "", "Companion", "Action", "a", "wcj", "ycj", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Dialog {
    public static final ycj Companion = new ycj();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(2))};
    public final String a;
    public final String b;
    public final List c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/objects/Dialog$Action;", "", "Companion", "ru/yandex/taxi/net/taxi/dto/objects/a", "BACK_TO_DRIVING_SCREEN", "GO_TO_EDIT_DESTINATION", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Action BACK_TO_DRIVING_SCREEN;
        public static final ru.yandex.taxi.net.taxi.dto.objects.a Companion;
        public static final Action GO_TO_EDIT_DESTINATION;

        static {
            Action action = new Action("BACK_TO_DRIVING_SCREEN", 0);
            BACK_TO_DRIVING_SCREEN = action;
            Action action2 = new Action("GO_TO_EDIT_DESTINATION", 1);
            GO_TO_EDIT_DESTINATION = action2;
            Action[] actionArr = {action, action2};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
            Companion = new ru.yandex.taxi.net.taxi.dto.objects.a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(3));
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Dialog(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final a a(Action action) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (action == ((a) obj).a) {
                break;
            }
        }
        return (a) obj;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/objects/Dialog$a;", "", "Companion", "ru/yandex/taxi/net/taxi/dto/objects/b", "ru/yandex/taxi/net/taxi/dto/objects/c", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(4)), null};
        public final Action a;
        public final String b;

        public /* synthetic */ a(int i, Action action, String str) {
            this.a = (i & 1) == 0 ? null : action;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            Action action = this.a;
            return this.b.hashCode() + ((action == null ? 0 : action.hashCode()) * 31);
        }

        public final String toString() {
            return "Option(action=" + this.a + ", buttonTitle=" + this.b + Extension.C_BRAKE;
        }

        public a(int i) {
            this.a = null;
            this.b = "";
        }

        public a() {
            this(0);
        }
    }

    public Dialog(int i) {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
    }

    public Dialog() {
        this(0);
    }
}
