package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatInfoChangedData;
import com.yandex.messaging.core.net.entities.ChatMember;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.core.net.entities.ChatRoleChangedData;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.core.net.entities.MiniappsBucket;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;
import com.yandex.messaging.core.net.entities.PreferencesBucket;
import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.core.net.entities.SelfRemovedData;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.UserReloadData;
import com.yandex.messaging.core.net.entities.UserStatusPresetBucket;
import com.yandex.messaging.core.net.entities.YouAddedData;
import com.yandex.messaging.core.net.entities.proto.MeetingUpdatedData;
import com.yandex.messaging.core.net.entities.proto.YouAddedToThreadData;
import com.yandex.messaging.core.net.entities.proto.YouRemovedFromThreadData;
import com.yandex.messaging.internal.storage.folders.d;

/* loaded from: classes15.dex */
public final class y5u0 implements StateSyncDiff.Handler {
    public final k020 a;
    public final u5b b;
    public final h3y c;
    public final bdu0 d;
    public final h9b e;
    public final h3y f;
    public final h3y g;
    public final ney0 h;
    public final glf i;
    public final d j;
    public final s5b0 k;

    public y5u0(k020 k020Var, u5b u5bVar, bdu0 bdu0Var, h3y h3yVar, h9b h9bVar, h3y h3yVar2, h3y h3yVar3, ney0 ney0Var, glf glfVar, d dVar, s5b0 s5b0Var) {
        this.a = k020Var;
        this.b = u5bVar;
        this.d = bdu0Var;
        this.c = h3yVar;
        this.e = h9bVar;
        this.f = h3yVar2;
        this.g = h3yVar3;
        this.h = ney0Var;
        this.i = glfVar;
        this.j = dVar;
        this.k = s5b0Var;
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void a(PinnedChatsBucket pinnedChatsBucket) {
        l020 C = this.a.C();
        try {
            C.w0(pinnedChatsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void b(MiniappsBucket miniappsBucket) {
        l020 C = this.a.C();
        try {
            C.g0(miniappsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void c(MeetingUpdatedData meetingUpdatedData) {
        this.h.getClass();
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void d(StickerPacksBucket stickerPacksBucket) {
        bdu0 bdu0Var = this.d;
        if (bdu0Var != null) {
            bdu0Var.b(stickerPacksBucket);
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void e(RestrictionsBucket restrictionsBucket) {
        l020 C = this.a.C();
        try {
            C.H0(restrictionsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void f(ChatRoleChangedData chatRoleChangedData) {
        String str = chatRoleChangedData.chatId;
        ((n3b) this.c.get()).a(str);
        ChatMember chatMember = chatRoleChangedData.chatMember;
        if (chatMember == null) {
            return;
        }
        l020 C = this.a.C();
        try {
            C.R(str, chatMember);
            qeb qebVar = (qeb) this.f.get();
            long j = chatMember.version;
            if (qebVar.a) {
                C.n(j);
            }
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void g(ChatMutingsBucket chatMutingsBucket) {
        l020 C = this.a.C();
        try {
            z83.g(null, this.b.c, Looper.myLooper());
            C.T(chatMutingsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void h(FoldersBucket foldersBucket) {
        d dVar = this.j;
        dVar.getClass();
        dVar.d(foldersBucket, null);
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void i(PrivacyBucket privacyBucket) {
        l020 C = this.a.C();
        try {
            C.x0(privacyBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void j(UserStatusPresetBucket userStatusPresetBucket) {
        glf glfVar = this.i;
        if (((hlf) glfVar.b.get()).w) {
            glfVar.a.a(userStatusPresetBucket, null);
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void k(HiddenPrivateChatsBucket hiddenPrivateChatsBucket) {
        l020 C = this.a.C();
        try {
            ((vgu) this.g.get()).d(C, hiddenPrivateChatsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void l(PreferencesBucket preferencesBucket) {
        this.k.a(preferencesBucket, null);
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void m(UserReloadData userReloadData) {
        l020 C = this.a.C();
        try {
            C.q0(userReloadData);
            C.C.b(userReloadData);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void n(YouAddedData youAddedData) {
        ChatData chatData = youAddedData.chat;
        l020 C = this.a.C();
        try {
            UserData userData = youAddedData.userData;
            if (userData != null) {
                C.P0(userData);
            }
            C.I(chatData);
            if (youAddedData.chatMember != null) {
                C.R(chatData.getChatId(), youAddedData.chatMember);
                qeb qebVar = (qeb) this.f.get();
                long j = youAddedData.chatMember.version;
                if (qebVar.a) {
                    C.n(j);
                }
            }
            C.s();
            C.close();
            new Handler().postDelayed(new tpt0(2, this, chatData), 2000L);
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void o(SelfRemovedData selfRemovedData) {
        l020 C = this.a.C();
        try {
            ChatMember chatMember = selfRemovedData.chatMember;
            if (chatMember != null) {
                C.R(selfRemovedData.chatId, chatMember);
                qeb qebVar = (qeb) this.f.get();
                long j = selfRemovedData.chatMember.version;
                if (qebVar.a) {
                    C.n(j);
                }
            }
            C.d(selfRemovedData.chatId, false);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void p(YouAddedToThreadData youAddedToThreadData) {
        ChatMember chatMember = youAddedToThreadData.getChatMember();
        String threadId = youAddedToThreadData.getThreadId();
        s020 e = this.e.e(threadId);
        l020 C = this.a.C();
        try {
            C.B.g(threadId, "");
            if (chatMember != null) {
                C.R(threadId, chatMember);
            }
            C.s();
            C.close();
            if (e != null) {
                ((rsx) ((m8g) e).r0.get()).b();
            }
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void q(ChatInfoChangedData chatInfoChangedData) {
        ((n3b) this.c.get()).a(chatInfoChangedData.chatId);
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff.Handler
    public final void r(YouRemovedFromThreadData youRemovedFromThreadData) {
        l020 C = this.a.C();
        try {
            ChatMember chatMember = youRemovedFromThreadData.getChatMember();
            String threadId = youRemovedFromThreadData.getThreadId();
            if (chatMember != null) {
                C.R(threadId, chatMember);
            }
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
