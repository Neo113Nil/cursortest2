package com.datadog.trace.api.naming.v1;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class PeerServiceNamingV1 {
    static {
        HashMap hashMap = new HashMap(7);
        hashMap.put("java-kafka", new String[]{"messaging.kafka.bootstrap.servers"});
        hashMap.put("hazelcast-sdk", new String[]{"hazelcast.instance", "peer.hostname"});
        hashMap.put("couchbase-client", new String[]{"db.couchbase.seed.nodes", "net.peer.name", "peer.hostname"});
        hashMap.put("java-cassandra", new String[]{"db.cassandra.contact.points", "peer.hostname"});
        String[] strArr = {"rpc.service", "peer.hostname"};
        hashMap.put("grpc-client", strArr);
        hashMap.put("armeria-grpc-client", strArr);
        hashMap.put("rmi-client", strArr);
        hashMap.put("java-aws-sdk", new String[0]);
    }
}
