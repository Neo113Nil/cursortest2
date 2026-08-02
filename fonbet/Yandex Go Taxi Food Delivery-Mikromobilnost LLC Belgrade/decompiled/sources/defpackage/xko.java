package defpackage;

import com.yandex.div.storage.database.StorageException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lxko;", "", "", "Lcom/yandex/div/storage/database/StorageException;", "errors", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "", "b", "()Z", "isSuccessful", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class xko {

    /* renamed from: a, reason: from kotlin metadata */
    private final List<StorageException> errors;

    public /* synthetic */ xko(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list);
    }

    public final List<StorageException> a() {
        return this.errors;
    }

    public final boolean b() {
        return this.errors.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xko(List<? extends StorageException> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xko() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
