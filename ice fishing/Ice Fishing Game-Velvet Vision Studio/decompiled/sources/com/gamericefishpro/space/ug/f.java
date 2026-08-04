package com.gamericefishpro.space.ug;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.g;
import com.gamericefishpro.space.fc.j;
import com.gamericefishpro.space.ph.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f implements com.gamericefishpro.space.tg.a, g {
    private final com.gamericefishpro.space.zg.b _customEventController;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.zc.a _languageContext;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;
    private final com.gamericefishpro.space.dc.b changeHandlersNotifier;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.lh.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.gamericefishpro.space.lh.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.lh.a) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lh.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.lh.b(this.$newUserState);
            it.a();
        }
    }

    public f(com.gamericefishpro.space.jh.b _subscriptionManager, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.zg.b _customEventController, com.gamericefishpro.space.zc.a _languageContext) {
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_customEventController, "_customEventController");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._customEventController = _customEventController;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new com.gamericefishpro.space.dc.b();
        _identityModelStore.subscribe((g) this);
    }

    private final com.gamericefishpro.space.bh.a get_identityModel() {
        return (com.gamericefishpro.space.bh.a) this._identityModelStore.getModel();
    }

    private final com.gamericefishpro.space.hh.a get_propertiesModel() {
        return (com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel();
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addAlias(String label, String id) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id, "id");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put(label, id);
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addAliases(Map<String, String> aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add empty alias");
                return;
            } else if (Intrinsics.a(entry.getKey(), "onesignal_id")) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "addEmail(email: " + email + ')');
        if (com.gamericefishpro.space.yb.g.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
            return;
        }
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add invalid email address as subscription: " + email);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addObserver(com.gamericefishpro.space.lh.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addSms(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "addSms(sms: " + sms + ')');
        if (com.gamericefishpro.space.yb.g.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
            return;
        }
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add invalid sms number as subscription: " + sms);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addTag(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put(key, value);
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void addTags(Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put(entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        com.gamericefishpro.space.bh.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!Intrinsics.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return m0.h(linkedHashMap);
    }

    public final com.gamericefishpro.space.dc.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.gamericefishpro.space.tg.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // com.gamericefishpro.space.tg.a
    public String getOnesignalId() {
        return com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // com.gamericefishpro.space.tg.a
    public com.gamericefishpro.space.mh.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final com.gamericefishpro.space.jh.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // com.gamericefishpro.space.tg.a
    public Map<String, String> getTags() {
        return m0.h(get_propertiesModel().getTags());
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelReplaced(com.gamericefishpro.space.bh.a model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new com.gamericefishpro.space.lh.c(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeAlias(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeAliases(Collection<String> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeAliases(labels: " + labels + ')');
        Collection<String> collection = labels;
        for (String str : collection) {
            if (str.length() == 0) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (Intrinsics.a(str, "onesignal_id")) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeEmail(email: " + email + ')');
        if (com.gamericefishpro.space.yb.g.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
            return;
        }
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove invalid email address as subscription: " + email);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeObserver(com.gamericefishpro.space.lh.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeSms(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeSms(sms: " + sms + ')');
        if (com.gamericefishpro.space.yb.g.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
            return;
        }
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove invalid sms number as subscription: " + sms);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeTag(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void removeTags(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "removeTags(keys: " + keys + ')');
        Collection<String> collection = keys;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // com.gamericefishpro.space.tg.a
    public void setLanguage(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // com.gamericefishpro.space.tg.a
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (com.gamericefishpro.space.yb.e.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
