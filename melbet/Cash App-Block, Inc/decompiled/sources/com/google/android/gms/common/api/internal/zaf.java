package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.android.volley.Response;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.measurement.zztw;
import com.google.android.gms.tasks.TaskCompletionSource;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class zaf extends zac {
    public final /* synthetic */ int $r8$classId;
    public final TaskCompletionSource zaa;
    public final Object zab;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zaf(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.$r8$classId = 1;
        this.zab = listenerKey;
    }

    private final /* bridge */ /* synthetic */ void zaf$com$google$android$gms$common$api$internal$zaf(zaaa zaaaVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void zaf$com$google$android$gms$common$api$internal$zah(zaaa zaaaVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zaa(zabk zabkVar) {
        int i = this.$r8$classId;
        Object obj = this.zab;
        switch (i) {
            case 0:
                return (Feature[]) ((zacd) obj).zaa.cacheEntry;
            default:
                zacd zacdVar = (zacd) zabkVar.zag.get((ListenerHolder.ListenerKey) obj);
                if (zacdVar == null) {
                    return null;
                }
                return (Feature[]) zacdVar.zaa.cacheEntry;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zab(zabk zabkVar) {
        int i = this.$r8$classId;
        Object obj = this.zab;
        switch (i) {
            case 0:
                return ((zacd) obj).zaa.intermediate;
            default:
                zacd zacdVar = (zacd) zabkVar.zag.get((ListenerHolder.ListenerKey) obj);
                return zacdVar != null && zacdVar.zaa.intermediate;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int zac(zabk zabkVar) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                if (((zacd) zabkVar.zag.get((ListenerHolder.ListenerKey) this.zab)) != null) {
                }
                break;
        }
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zaf(zaaa zaaaVar, boolean z) {
        int i = this.$r8$classId;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) {
        try {
            zah(zabkVar);
        } catch (DeadObjectException e) {
            zad(zai.zai(e));
            throw e;
        } catch (RemoteException e2) {
            zad(zai.zai(e2));
        } catch (RuntimeException e3) {
            this.zaa.trySetException(e3);
        }
    }

    public final void zah(zabk zabkVar) {
        switch (this.$r8$classId) {
            case 0:
                zacd zacdVar = (zacd) this.zab;
                Response response = zacdVar.zaa;
                response.registerListener(zabkVar.zac, this.zaa);
                ListenerHolder.ListenerKey listenerKey = ((ListenerHolder) response.result).zab;
                if (listenerKey != null) {
                    zabkVar.zag.put(listenerKey, zacdVar);
                    break;
                }
                break;
            default:
                zacd zacdVar2 = (zacd) zabkVar.zag.remove((ListenerHolder.ListenerKey) this.zab);
                if (zacdVar2 == null) {
                    this.zaa.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((zztw) ((PopEncryptorV2_) zacdVar2.zab.zab).hmacKey).accept(zabkVar.zac, this.zaa);
                    ((ListenerHolder) zacdVar2.zaa.result).zab = null;
                    break;
                }
        }
    }

    public zaf(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zaf(zacd zacdVar, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.$r8$classId = 0;
        this.zab = zacdVar;
    }
}
